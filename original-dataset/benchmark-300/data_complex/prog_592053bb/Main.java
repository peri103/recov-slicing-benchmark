import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit the write operation to the executor
        Future<?> writeFuture = executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit the read operation to the executor
        Future<Integer> readFuture = executor.submit(() -> {
            try {
                /* read */ return queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });

        // Wait for the write operation to complete
        try {
            writeFuture.get(1, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Wait for the read operation to complete and print the result
        try {
            Integer value = readFuture.get(1, TimeUnit.SECONDS);
            System.out.println("Read value: " + value);
        } catch (Exception e) {
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

        // Additional unrelated code to make the program more complex
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            try {
                stringQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                String message = stringQueue.take();
                System.out.println("Additional message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

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