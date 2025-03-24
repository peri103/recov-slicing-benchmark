import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Generate a list of random numbers
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        // Print the generated numbers
        System.out.println("Generated numbers: " + numbers);

        // Write thread
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(numbers.get(0));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Read thread
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start threads
        writer.start();
        reader.start();

        // Wait for threads to finish
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional operations on the list
        numbers.sort(Integer::compareTo);
        System.out.println("Sorted numbers: " + numbers);

        // Calculate the sum of the numbers
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);

        // Find the maximum number
        int max = numbers.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Maximum number: " + max);
    }
}