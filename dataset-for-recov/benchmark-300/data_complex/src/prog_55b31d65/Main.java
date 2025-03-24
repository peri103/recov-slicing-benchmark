import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task for writing to the queue
        Runnable writerTask = () -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Write operation completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Task for reading from the queue
        Runnable readerTask = () -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read operation completed. Value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Submit tasks to the executor
        executor.submit(writerTask);
        executor.submit(readerTask);

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        // Additional unrelated code to make the program more complex
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        Runnable stringWriterTask = () -> {
            try {
                stringQueue.put("Hello, World!");
                System.out.println("String write operation completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable stringReaderTask = () -> {
            try {
                String message = stringQueue.take();
                System.out.println("String read operation completed. Message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        ExecutorService stringExecutor = Executors.newFixedThreadPool(2);
        stringExecutor.submit(stringWriterTask);
        stringExecutor.submit(stringReaderTask);

        stringExecutor.shutdown();
        try {
            if (!stringExecutor.awaitTermination(10, TimeUnit.SECONDS)) {
                stringExecutor.shutdownNow();
            }
        } catch (InterruptedException e) {
            stringExecutor.shutdownNow();
        }
    }
}