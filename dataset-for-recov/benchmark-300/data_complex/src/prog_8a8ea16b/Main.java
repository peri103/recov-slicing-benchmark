import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();

        // Thread to write to the queue
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
                logQueue.put("Value 42 written to SynchronousQueue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read from the queue
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                logQueue.put("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to log messages
        Thread logger = new Thread(() -> {
            try {
                while (true) {
                    String log = logQueue.take();
                    System.out.println(log);
                    if (log.contains("Read value")) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start all threads
        writer.start();
        reader.start();
        logger.start();

        // Wait for all threads to finish
        try {
            writer.join();
            reader.join();
            logger.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}