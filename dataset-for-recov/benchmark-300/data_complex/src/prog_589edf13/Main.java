import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task to write to the queue
        Runnable writerTask = () -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Task to read from the queue
        Runnable readerTask = () -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Submit tasks to the executor
        executor.submit(writerTask);
        executor.submit(readerTask);

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        // Additional unrelated code to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More unrelated code
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}