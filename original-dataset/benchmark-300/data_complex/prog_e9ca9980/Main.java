import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Generate some random numbers and add them to a list
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

        // Start the writer thread
        writerThread.start();

        // Perform some unrelated operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of random numbers: " + sum);

        // Create another list and shuffle it
        List<Integer> shuffledNumbers = new ArrayList<>(numbers);
        java.util.Collections.shuffle(shuffledNumbers);
        System.out.println("Shuffled numbers: " + shuffledNumbers);

        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Value taken from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform more unrelated operations
        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("Maximum number in the list: " + max);
    }
}