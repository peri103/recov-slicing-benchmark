import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Create a thread to perform the write operation
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value 42 has been written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Create a thread to perform the read operation
        executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Additional unrelated code to make the program more complex
        System.out.println("Performing some unrelated operations...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Unrelated operation " + (i + 1));
        }
        
        // More complex operations
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
                String str = stringQueue.take();
                System.out.println("Read string: " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("All operations completed.");
    }
}