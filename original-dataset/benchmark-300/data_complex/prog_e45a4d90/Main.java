import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a thread to write to the queue
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create a thread to read from the queue
        executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        // Additional code to make the program more complex
        SynchronousQueue<String> anotherQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        // Write a string to another queue
        executor.submit(() -> {
            try {
                anotherQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Read the string from another queue
        executor.submit(() -> {
            try {
                String message = anotherQueue.take();
                System.out.println(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}