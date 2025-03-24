import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);

        // Create a separate thread to perform the write operation
        executor.submit(() -> {
            try {
                int number = random.nextInt(100);
                writer.writeData(number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                int randomNumber = random.nextInt(50);
                System.out.println("Generated random number: " + randomNumber);
            });
        }

        // Perform the read operation in a separate thread
        executor.submit(() -> {
            try {
                reader.readData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
    }
}