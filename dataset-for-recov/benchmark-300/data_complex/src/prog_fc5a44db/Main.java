import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        // Thread to write data
        executor.submit(() -> {
            try {
                int randomValue = random.nextInt(100);
                System.out.println("Generated value: " + randomValue);
                /* write */ queue.put(randomValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read data
        executor.submit(() -> {
            try {
                Thread.sleep(1000); // Simulate some delay
                /* read */ int value = queue.take();
                System.out.println("Received value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
    }
}