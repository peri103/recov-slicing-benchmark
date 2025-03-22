import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<Integer, String> numberMap = new HashMap<>();

        // Adding some elements to stringList
        stringList.add("Hello");
        stringList.add("World");

        // Adding some key-value pairs to numberMap
        numberMap.put(1, "One");
        numberMap.put(2, "Two");

        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
                System.out.println("Value written to the queue.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Writer thread interrupted.");
            }
        });

        // Additional processing on stringList
        for (String str : stringList) {
            System.out.println("String from list: " + str);
        }

        // Additional processing on numberMap
        for (Map.Entry<Integer, String> entry : numberMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        Thread readerThread = new Thread(() -> {
            try {
                // Simulate some delay before reading
                Thread.sleep(1000);
                /* read */ int value = queue.take();
                System.out.println("Value read from the queue: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Reader thread interrupted.");
            }
        });

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }
    }
}