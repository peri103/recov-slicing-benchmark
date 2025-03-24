import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ArrayBlockingQueue<Integer> arrayQueue = new ArrayBlockingQueue<>(10);
        Random random = new Random();

        try {
            // Initialize and manipulate arrayQueue
            for (int i = 0; i < 5; i++) {
                arrayQueue.put(random.nextInt(100));
            }

            // Perform some operations on arrayQueue
            int sum = 0;
            for (Integer num : arrayQueue) {
                sum += num;
            }
            System.out.println("Sum of arrayQueue elements: " + sum);

            // Write to the LinkedBlockingQueue
            /* write */ queue.put(42);

            // Perform some unrelated operations
            int randomNumber = random.nextInt(50);
            System.out.println("Random number generated: " + randomNumber);

            // Read from the LinkedBlockingQueue
            /* read */ int value = queue.take();
            System.out.println("Value read from queue: " + value);

            // More unrelated operations
            for (int i = 0; i < 3; i++) {
                arrayQueue.put(random.nextInt(100));
            }

            // Print final state of arrayQueue
            System.out.println("Final elements in arrayQueue: " + arrayQueue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}