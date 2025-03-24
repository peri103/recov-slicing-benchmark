import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();
        MessageProcessor processor = new MessageProcessor(messageQueue);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Sender task
        executor.submit(() -> {
            try {
                messageQueue.sendMessage(1);
                System.out.println("Sent Message: 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Processor task
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate delay
                processor.processMessage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional unrelated code
        ExecutorService anotherExecutor = Executors.newFixedThreadPool(2);

        // Another sender task
        anotherExecutor.submit(() -> {
            try {
                messageQueue.sendMessage(2);
                System.out.println("Sent Message: 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Another processor task
        anotherExecutor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); // Simulate delay
                processor.processMessage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        anotherExecutor.shutdown();
        try {
            anotherExecutor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}