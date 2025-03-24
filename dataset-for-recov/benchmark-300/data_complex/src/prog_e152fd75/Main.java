import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task to write the value
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value 42 has been written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit a task to read the value
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate some delay
                /* read */ int value = queue.take();
                System.out.println("Value " + value + " has been read from the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional unrelated code to make the program more complex
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                stringQueue.put("Hello");
                System.out.println("String 'Hello' has been written to the stringQueue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate some delay
                String value = stringQueue.take();
                System.out.println("String '" + value + "' has been read from the stringQueue.");
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