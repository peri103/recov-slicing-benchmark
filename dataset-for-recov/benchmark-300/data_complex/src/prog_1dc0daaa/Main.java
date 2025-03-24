import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Thread to perform the write operation
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value 42 written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Simulate some unrelated operations
        for (int i = 0; i < 3; i++) {
            executor.submit(() -> {
                try {
                    System.out.println("Performing unrelated task...");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Thread to perform the read operation
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
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }
}