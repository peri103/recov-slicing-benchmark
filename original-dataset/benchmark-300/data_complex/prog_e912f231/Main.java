import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Writer task
        Future<?> writerFuture = executor.submit(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Reader task
        Future<?> readerFuture = executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Wait for tasks to complete
        try {
            writerFuture.get();
            readerFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown executor
        executor.shutdown();

        // Additional complex code
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        // Another writer task
        executor.submit(() -> {
            try {
                stringQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Another reader task
        executor.submit(() -> {
            try {
                String message = stringQueue.take();
                System.out.println("Read message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown executor
        executor.shutdown();
    }
}