import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a Callable task to write to the queue
        Callable<Void> writerTask = () -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        };

        // Create a Callable task to read from the queue
        Callable<Void> readerTask = () -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        };

        // Submit both tasks to the executor
        Future<Void> writerFuture = executor.submit(writerTask);
        Future<Void> readerFuture = executor.submit(readerTask);

        // Wait for both tasks to complete
        try {
            writerFuture.get();
            readerFuture.get();
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
        System.out.println("Program completed.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Unrelated task " + i);
        }
    }
}