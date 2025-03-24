import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Create an ExecutorService to manage threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Submit a task to perform the write operation
        Future<?> writeFuture = executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Write operation completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Submit a task to perform the read operation
        Future<?> readFuture = executor.submit(() -> {
            try {
                // Introduce a delay to ensure the write operation happens first
                TimeUnit.SECONDS.sleep(1);
                /* read */ int value = queue.take();
                System.out.println("Read operation completed. Value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Shutdown the executor service after tasks are completed
        executor.shutdown();
        
        // Wait for all tasks to complete
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}