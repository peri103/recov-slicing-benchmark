import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Thread to write the value
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read the value
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Add some unrelated code to make the program more complex
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("Generated list: " + list);

        // Wait for both threads to finish
        writerThread.join();
        readerThread.join();

        // More unrelated code
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list elements: " + sum);

        // Even more unrelated code
        List<Integer> squaredList = list.stream().map(x -> x * x).toList();
        System.out.println("Squared list: " + squaredList);
    }
}