import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
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
        Future<Integer> readFuture = executor.submit(() -> {
            try {
                /* read */ return queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });
        
        // Wait for the write and read operations to complete
        try {
            writeFuture.get();
            int value = readFuture.get();
            System.out.println(value);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
        // Shutdown the executor service
        executor.shutdown();
    }
}