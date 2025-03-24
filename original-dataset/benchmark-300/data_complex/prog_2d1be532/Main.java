import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Additional complex code
        executor.submit(() -> {
            try {
                System.out.println("Starting writer thread...");
                /* write */ queue.put(42);
                System.out.println("Writer thread completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // More unrelated code
        executor.submit(() -> {
            try {
                System.out.println("Starting reader thread...");
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
                System.out.println("Reader thread completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Additional complex code
        executor.submit(() -> {
            try {
                System.out.println("Starting another thread for unrelated task...");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Unrelated task iteration: " + i);
                    TimeUnit.MILLISECONDS.sleep(100);
                }
                System.out.println("Unrelated task completed.");
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
    }
}