import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Add some unrelated operations to make the program more complex
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        // Perform the read operation in the main thread
        /* read */ int value = queue.take();
        System.out.println("Value read from queue: " + value);

        // Ensure the writer thread completes
        writerThread.join();

        // More unrelated operations
        List<Integer> filteredList = new ArrayList<>();
        for (int num : list) {
            if (num > 50) {
                filteredList.add(num);
            }
        }

        System.out.println("Filtered list: " + filteredList);
    }
}