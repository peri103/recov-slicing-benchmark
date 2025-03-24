import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Populate the list with random numbers
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();

        // Perform some unrelated operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of random numbers: " + sum);

        // Simulate some delay
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform the read operation
        try {
            /* read */ int value = queue.take();
            System.out.println("Value read from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More unrelated operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}