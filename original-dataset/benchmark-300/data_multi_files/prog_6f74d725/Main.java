import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();
        Logger logger = new Logger();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Thread to write to the queue
        executor.submit(() -> {
            try {
                messageQueue.putMessage(42);
                logger.log("Write operation completed successfully.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read from the queue
        executor.submit(() -> {
            try {
                int value = messageQueue.takeMessage();
                logger.log("Read operation completed successfully. Value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to log messages
        executor.submit(() -> {
            try {
                while (true) {
                    String logMessage = logger.takeLog();
                    System.out.println(logMessage);
                    if (logMessage.contains("Read operation completed")) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the executor
        executor.shutdown();
    }
}