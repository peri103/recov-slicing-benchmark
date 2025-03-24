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

        // Use a separate thread to perform the write operation
        executor.submit(() -> {
            try {
                int valueToWrite = random.nextInt(100);
                System.out.println("Preparing to write value: " + valueToWrite);
                /* write */ queue.put(valueToWrite);
                System.out.println("Value written: " + valueToWrite);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Perform some unrelated operations
        executor.submit(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Performing unrelated task " + i);
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Value read: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
        try {
            if (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}