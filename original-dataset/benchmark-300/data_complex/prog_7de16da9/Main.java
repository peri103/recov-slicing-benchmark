import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task to write to the queue
        Future<?> writeFuture = executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Submit a task to read from the queue
        Future<Integer> readFuture = executor.submit(() -> {
            try {
                return /* read */ queue.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        });

        // Wait for the write to complete
        writeFuture.get();

        // Wait for the read to complete and print the value
        int value = readFuture.get();
        System.out.println("Read value: " + value);

        // Shutdown the executor
        executor.shutdown();

        // Additional unrelated code to make the program more complex
        LinkedTransferQueue<String> stringQueue = new LinkedTransferQueue<>();
        executor = Executors.newSingleThreadExecutor();
        Future<?> stringWriteFuture = executor.submit(() -> {
            try {
                stringQueue.put("Hello, World!");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Future<String> stringReadFuture = executor.submit(() -> {
            try {
                return stringQueue.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        });

        stringWriteFuture.get();
        String stringValue = stringReadFuture.get();
        System.out.println("Read string value: " + stringValue);

        executor.shutdown();
    }
}