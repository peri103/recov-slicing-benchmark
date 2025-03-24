import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Generate some random numbers and add them to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(100));
        }

        // Print the generated numbers
        System.out.println("Generated numbers: " + numbers);

        try {
            // Write the first number from the list to the queue
            /* write */ queue.put(numbers.get(0));

            // Perform some operations with the list
            for (int i = 1; i < numbers.size(); i++) {
                queue.put(numbers.get(i));
            }

            // Read the first number from the queue
            /* read */ int value = queue.take();
            System.out.println("Value read from queue: " + value);

            // Print the remaining numbers in the queue
            System.out.println("Remaining numbers in queue:");
            while (!queue.isEmpty()) {
                System.out.println(queue.take());
            }

            // Add some more numbers to the list
            for (int i = 0; i < 3; i++) {
                numbers.add(random.nextInt(100));
            }

            // Print the updated list
            System.out.println("Updated numbers: " + numbers);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}