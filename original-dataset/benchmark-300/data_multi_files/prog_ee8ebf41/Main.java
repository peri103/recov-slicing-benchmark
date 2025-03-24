import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task to write to the queue
        executor.submit(() -> {
            try {
                queueManager.putValue(42);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Task to read from the queue
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate some delay
                int value = queueManager.takeValue();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);

        // Additional unrelated code to make the program more complex
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                stringQueue.put("Hello");
                System.out.println("String 'Hello' has been put into the queue.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate some delay
                String message = stringQueue.take();
                System.out.println("String '" + message + "' has been taken from the queue.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);
    }
}