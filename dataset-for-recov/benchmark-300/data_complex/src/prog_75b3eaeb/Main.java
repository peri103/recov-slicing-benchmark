import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Using ExecutorService to manage threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Submit a task to write the value
        Future<?> writeFuture = executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Submit a task to read the value
        Future<?> readFuture = executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Wait for both tasks to complete
        try {
            writeFuture.get();
            readFuture.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Shutdown the executor service
        executor.shutdown();
        
        // Additional complexity: Using a different SynchronousQueue for another pair
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        
        executor = Executors.newFixedThreadPool(2);
        
        // Submit a task to write a string
        executor.submit(() -> {
            try {
                stringQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Submit a task to read the string
        executor.submit(() -> {
            try {
                String message = stringQueue.take();
                System.out.println("Read message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Shutdown the executor service
        executor.shutdown();
    }
}