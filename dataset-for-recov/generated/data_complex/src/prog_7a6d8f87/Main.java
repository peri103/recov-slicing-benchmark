import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        Map<Integer, String> map = new HashMap<>();

        // Start writer thread for SynchronousQueue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start reader thread for SynchronousQueue
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("SynchronousQueue value: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Additional writer thread for stringQueue
        Thread stringWriterThread = new Thread(() -> {
            try {
                stringQueue.put("Hello");
                stringQueue.put("World");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Additional reader thread for stringQueue
        Thread stringReaderThread = new Thread(() -> {
            try {
                while (true) {
                    String message = stringQueue.take();
                    System.out.println("StringQueue message: " + message);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Populate map with some data
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Start all threads
        writerThread.start();
        readerThread.start();
        stringWriterThread.start();
        stringReaderThread.start();

        // Iterate through the map and print values
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Map entry: " + entry.getKey() + " = " + entry.getValue());
        }

        try {
            writerThread.join();
            readerThread.join();
            stringWriterThread.join();
            stringReaderThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}