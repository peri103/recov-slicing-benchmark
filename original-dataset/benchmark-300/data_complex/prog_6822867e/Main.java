import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Producer task
        executor.submit(() -> {
            try {
                /* write */ queue.put(1);
                System.out.println("Produced: 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer task
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate delay
                /* read */ int value = queue.take();
                System.out.println("Consumed: " + value);
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

        // Additional unrelated code
        BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        executor = Executors.newFixedThreadPool(2);

        // Producer task for stringQueue
        executor.submit(() -> {
            try {
                stringQueue.put("Hello");
                System.out.println("Produced: Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer task for stringQueue
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate delay
                String message = stringQueue.take();
                System.out.println("Consumed: " + message);
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