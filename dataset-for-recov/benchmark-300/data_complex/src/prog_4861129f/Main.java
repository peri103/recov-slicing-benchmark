import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the deque and a random number generator
            LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
            BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
            Random random = new Random();

            // Add some random numbers to the queue
            for (int i = 0; i < 5; i++) {
                queue.put(random.nextInt(100));
            }

            // Perform some operations on the queue
            while (!queue.isEmpty()) {
                int num = queue.take();
                System.out.println("Processing number: " + num);
            }

            // Write to the deque
            /* write */ deque.addFirst(42);

            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 integers: " + sum);

            // Read from the deque
            /* read */ int value = deque.takeFirst();
            System.out.println("Value read from deque: " + value);

            // More unrelated operations
            String[] fruits = {"Apple", "Banana", "Cherry"};
            for (String fruit : fruits) {
                System.out.println("Fruit: " + fruit);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}