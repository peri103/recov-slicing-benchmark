import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Task to write the value
        Runnable writerTask = () -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value 42 written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        
        // Task to read the value
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
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Additional complex code
        System.out.println("Starting additional complex operations...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing operation " + i);
        }
        System.out.println("Additional operations completed.");
    }
}