import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Create a separate thread for writing to the queue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Add some unrelated code to make the program more complex
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        // Print the list
        System.out.println("Generated List: " + list);

        // Read from the queue in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Value taken from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More unrelated code
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list elements: " + sum);

        // Find the maximum value in the list
        int max = list.stream().max(Integer::compare).orElse(0);
        System.out.println("Maximum value in list: " + max);
    }
}