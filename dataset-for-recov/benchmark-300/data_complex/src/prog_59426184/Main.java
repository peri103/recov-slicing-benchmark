import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task to perform the write operation
        Future<?> writerFuture = executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit a task to perform the read operation
        Future<Integer> readerFuture = executor.submit(() -> {
            try {
                return /* read */ queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });

        // Wait for the write operation to complete
        writerFuture.get();

        // Retrieve the value from the read operation
        int value = readerFuture.get();

        // Shutdown the executor
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println(value);

        // Additional complex code
        SynchronousQueue<String> anotherQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        // Submit a task to perform another write operation
        Future<?> anotherWriterFuture = executor.submit(() -> {
            try {
                anotherQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit a task to perform another read operation
        Future<String> anotherReaderFuture = executor.submit(() -> {
            try {
                return anotherQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });

        // Wait for the write operation to complete
        anotherWriterFuture.get();

        // Retrieve the value from the read operation
        String anotherValue = anotherReaderFuture.get();

        // Shutdown the executor
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println(anotherValue);
    }
}