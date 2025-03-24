import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Use a separate thread to write to the queue
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value 42 has been written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Use a separate thread to read from the queue
        executor.submit(() -> {
            try {
                // Simulate some delay before reading
                TimeUnit.SECONDS.sleep(1);
                /* read */ int value = queue.take();
                System.out.println("Value " + value + " has been read from the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional unrelated code to make the program more complex
        SynchronousQueue<String> anotherQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                anotherQueue.put("Hello");
                System.out.println("String 'Hello' has been written to another queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                String message = anotherQueue.take();
                System.out.println("String '" + message + "' has been read from another queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}