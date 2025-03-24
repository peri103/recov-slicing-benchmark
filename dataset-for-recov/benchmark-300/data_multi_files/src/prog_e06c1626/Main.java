import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a Callable task for the write operation
        Callable<Void> writerTask = () -> {
            /* write */ queue.put(42);
            return null;
        };

        // Submit the write task to the executor
        Future<Void> writerFuture = executor.submit(writerTask);

        // Additional complex code
        SynchronousQueue<String> anotherQueue = new SynchronousQueue<>();

        // Create a Callable task for another write operation
        Callable<Void> anotherWriterTask = () -> {
            anotherQueue.put("Hello");
            return null;
        };

        // Submit the another write task to the executor
        Future<Void> anotherWriterFuture = executor.submit(anotherWriterTask);

        // Wait for the write tasks to complete
        try {
            writerFuture.get();
            anotherWriterFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
