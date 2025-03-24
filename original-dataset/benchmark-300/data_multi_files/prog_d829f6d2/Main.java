import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        
        // Create an executor service to manage threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task to write to the queue
        Future<?> writeFuture = executor.submit(() -> {
            try {
                queueManager.writeValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit a task to read from the queue
        Future<?> readFuture = executor.submit(() -> {
            try {
                int value = queueManager.readValue();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Wait for the tasks to complete
        try {
            writeFuture.get();
            readFuture.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutdown the executor service
        executor.shutdown();

        // Additional complex code
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        // Submit a task to write a string to the queue
        executor.submit(() -> {
            try {
                stringQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit a task to read a string from the queue
        executor.submit(() -> {
            try {
                String message = stringQueue.take();
                System.out.println("Read message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor service
        executor.shutdown();
    }
}