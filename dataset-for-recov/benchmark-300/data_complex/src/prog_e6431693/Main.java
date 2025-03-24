import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        // Thread to write data
        executor.submit(() -> {
            try {
                int value = random.nextInt(100);
                System.out.println("Generated value: " + value);
                /* write */ queue.put(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read data
        executor.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(500); // Simulate some delay
                /* read */ int value = queue.take();
                System.out.println("Received value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Additional unrelated code to make the program more complex
        executor.submit(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Doing some unrelated work: " + i);
                    TimeUnit.MILLISECONDS.sleep(200);
                }
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