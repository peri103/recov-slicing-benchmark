import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Thread to write data
        Thread writerThread = new Thread(() -> {
            try {
                int value = random.nextInt(100);
                /* write */ queue.put(value);
                System.out.println("Wrote value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read data
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
                list.add(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        writerThread.start();
        readerThread.start();

        // Wait for threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional code to make the program more complex
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("List contents:");
        for (int num : list) {
            System.out.println(num);
        }

        // Another unrelated operation
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list elements: " + sum);
    }
}