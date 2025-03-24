import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Reader {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a Callable task for the read operation
        Callable<Void> readerTask = () -> {
            /* read */ int value = queue.take();
            System.out.println("Value read: " + value);
            return null;
        };

        // Submit the read task to the executor
        Future<Void> readerFuture = executor.submit(readerTask);

        // Additional complex code
        SynchronousQueue<String> anotherQueue = new SynchronousQueue<>();

        // Create a Callable task for another read operation
        Callable<Void> anotherReaderTask = () -> {
            String message = anotherQueue.take();
            System.out.println("Message read: " + message);
            return null;
        };

        // Submit the another read task to the executor
        Future<Void> anotherReaderFuture = executor.submit(anotherReaderTask);

        // Wait for the read tasks to complete
        try {
            readerFuture.get();
            anotherReaderFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}