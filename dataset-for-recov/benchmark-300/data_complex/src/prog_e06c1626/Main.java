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

        // Create a Callable task for the read operation
        Callable<Void> readerTask = () -> {
            /* read */ int value = queue.take();
            System.out.println("Value read: " + value);
            return null;
        };

        // Submit the tasks to the executor
        Future<Void> writerFuture = executor.submit(writerTask);
        Future<Void> readerFuture = executor.submit(readerTask);

        // Wait for the tasks to complete
        try {
            writerFuture.get();
            readerFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();

        // Additional complex code
        SynchronousQueue<String> anotherQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        // Create a Callable task for the write operation
        Callable<Void> anotherWriterTask = () -> {
            anotherQueue.put("Hello");
            return null;
        };

        // Create a Callable task for the read operation
        Callable<Void> anotherReaderTask = () -> {
            String message = anotherQueue.take();
            System.out.println("Message read: " + message);
            return null;
        };

        // Submit the tasks to the executor
        Future<Void> anotherWriterFuture = executor.submit(anotherWriterTask);
        Future<Void> anotherReaderFuture = executor.submit(anotherReaderTask);

        // Wait for the tasks to complete
        try {
            anotherWriterFuture.get();
            anotherReaderFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}