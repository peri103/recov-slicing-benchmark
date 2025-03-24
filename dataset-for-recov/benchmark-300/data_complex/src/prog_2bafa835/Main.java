import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Writer task
        Runnable writerTask = () -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value written to queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Reader task
        Runnable readerTask = () -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Submit tasks to executor
        executor.submit(writerTask);
        executor.submit(readerTask);

        // Shutdown executor and wait for tasks to complete
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        // Additional unrelated code to make the program more complex
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        Runnable stringWriterTask = () -> {
            try {
                stringQueue.put("Hello");
                System.out.println("String written to queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable stringReaderTask = () -> {
            try {
                String str = stringQueue.take();
                System.out.println("String read from queue: " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        ExecutorService stringExecutor = Executors.newFixedThreadPool(2);
        stringExecutor.submit(stringWriterTask);
        stringExecutor.submit(stringReaderTask);

        stringExecutor.shutdown();
        try {
            if (!stringExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                stringExecutor.shutdownNow();
            }
        } catch (InterruptedException e) {
            stringExecutor.shutdownNow();
        }
    }
}