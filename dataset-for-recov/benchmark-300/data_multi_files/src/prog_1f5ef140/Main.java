import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);

        // Create a thread to write the value
        executor.submit(() -> {
            int valueToWrite = random.nextInt(100);
            writer.writeData(valueToWrite);
        });

        // Create a thread to read the value
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate some delay
                reader.readData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional unrelated code to make the program more complex
        System.out.println("Performing some unrelated operations...");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += random.nextInt(10);
        }
        System.out.println("Sum of random numbers: " + sum);

        // More unrelated code
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}