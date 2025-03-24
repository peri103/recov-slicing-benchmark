import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task to write to the queue
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Task to read from the queue
        executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Additional complexity: Adding more elements to the queue
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                try {
                    queue.put(i * 10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Additional complexity: Reading more elements from the queue
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                try {
                    int val = queue.take();
                    System.out.println("Additional read: " + val);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
    }
}