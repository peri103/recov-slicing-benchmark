import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Start a new thread to perform the write operation
        Future<?> writeFuture = executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated task " + i);
        }

        // Start another thread to perform the read operation
        Future<Integer> readFuture = executor.submit(() -> {
            try {
                /* read */ return queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });

        try {
            int value = readFuture.get();
            System.out.println("Read value: " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }

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