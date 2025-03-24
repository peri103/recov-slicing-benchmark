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

        // Thread to write to the queue
        executor.submit(() -> {
            try {
                int valueToWrite = random.nextInt(100);
                System.out.println("Writing value: " + valueToWrite);
                /* write */ queue.put(valueToWrite);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Simulate some unrelated work
        executor.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("Doing some unrelated work...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read from the queue
        executor.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000); // Simulate delay
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}