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

        // Thread to write to the queue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(numbers.get(0));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read from the queue
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
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
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        sortedNumbers.sort(Integer::compareTo);

        System.out.println("Original numbers: " + numbers);
        System.out.println("Sorted numbers: " + sortedNumbers);

        int sum = sortedNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of sorted numbers: " + sum);

        int max = sortedNumbers.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Max number: " + max);

        int min = sortedNumbers.stream().min(Integer::compareTo).orElse(0);
        System.out.println("Min number: " + min);
    }
}