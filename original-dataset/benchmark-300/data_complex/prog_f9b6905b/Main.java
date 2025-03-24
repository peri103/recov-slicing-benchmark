import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        LinkedBlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        Random random = new Random();

        // Adding some unrelated operations
        for (int i = 0; i < 5; i++) {
            stringQueue.offer("String " + i);
        }

        // Performing some operations on stringQueue
        for (int i = 0; i < 3; i++) {
            System.out.println(stringQueue.poll());
        }

        // Adding more complexity
        int randomNumber = random.nextInt(100);
        System.out.println("Generated random number: " + randomNumber);

        // Writing to the PriorityBlockingQueue
        /* write */ queue.offer(42);

        // More unrelated operations
        for (int i = 0; i < 5; i++) {
            queue.offer(random.nextInt(100));
        }

        // Reading from the PriorityBlockingQueue
        /* read */ Integer value = queue.poll();
        System.out.println("Value read from queue: " + value);

        // Additional operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            System.out.println("Polling from queue: " + queue.poll());
        }
    }
}