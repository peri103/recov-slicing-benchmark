import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Submit a task to perform the write operation
        Future<?> writeFuture = executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated task " + i);
            Thread.sleep(100);
        }
        
        // Submit a task to perform the read operation
        Future<Integer> readFuture = executor.submit(() -> {
            try {
                return /* read */ queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });
        
        // Ensure the write operation completes
        writeFuture.get();
        
        // Get the result of the read operation
        int value = readFuture.get();
        System.out.println("Read value: " + value);
        
        // Shutdown the executor
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
    }
}