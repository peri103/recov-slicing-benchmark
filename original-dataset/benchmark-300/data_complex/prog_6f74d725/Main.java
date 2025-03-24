import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Thread to write to the queue
        executor.submit(() -> {
            try {
                /* write */ queue.put(42);
                logQueue.put("Write operation completed successfully.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read from the queue
        executor.submit(() -> {
            try {
                /* read */ int value = queue.take();
                logQueue.put("Read operation completed successfully. Value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to log messages
        executor.submit(() -> {
            try {
                while (true) {
                    String logMessage = logQueue.take();
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