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

        // Task to write the value
        Callable<Void> writerTask = () -> {
            /* write */ queue.put(42);
            return null;
        };

        // Task to read the value
        Callable<Void> readerTask = () -> {
            /* read */ int value = queue.take();
            System.out.println("Read value: " + value);
            return null;
        };

        // Submit tasks to the executor
        Future<Void> writerFuture = executor.submit(writerTask);
        Future<Void> readerFuture = executor.submit(readerTask);

        // Wait for both tasks to complete
        try {
            writerFuture.get();
            readerFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();

        // Additional unrelated code to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Another unrelated task
        SynchronousQueue<String> anotherQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        Callable<Void> anotherWriterTask = () -> {
            anotherQueue.put("Hello");
            return null;
        };

        Callable<Void> anotherReaderTask = () -> {
            String message = anotherQueue.take();
            System.out.println("Read message: " + message);
            return null;
        };

        Future<Void> anotherWriterFuture = executor.submit(anotherWriterTask);
        Future<Void> anotherReaderFuture = executor.submit(anotherReaderTask);

        try {
            anotherWriterFuture.get();
            anotherReaderFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}