import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();

        // Add some unrelated operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Perform the read operation in the main thread
        /* read */ int value = queue.take();
        System.out.println("Value read from queue: " + value);

        writerThread.join(); // Ensure the writer thread completes

        // More unrelated operations
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        // Another unrelated operation
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        Thread stringWriterThread = new Thread(() -> {
            try {
                stringQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        stringWriterThread.start();
        String stringValue = stringQueue.take();
        System.out.println("String value read from queue: " + stringValue);

        stringWriterThread.join();
    }
}