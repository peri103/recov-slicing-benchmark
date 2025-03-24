import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();

        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
                logQueue.put("Write operation completed: 42");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Perform some unrelated operations
        try {
            TimeUnit.SECONDS.sleep(1); // Simulate some delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            logQueue.put("Read operation completed: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Process the log messages
        while (!logQueue.isEmpty()) {
            try {
                System.out.println(logQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Additional unrelated operations
        BlockingQueue<Integer> anotherQueue = new LinkedBlockingQueue<>();
        try {
            anotherQueue.put(100);
            System.out.println("Unrelated operation: Added 100 to another queue");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}