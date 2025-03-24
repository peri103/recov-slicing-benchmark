import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        LinkedBlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        Random random = new Random();

        // Adding some unrelated operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            stringQueue.put("String " + i);
        }

        /* write */ queue.put(1);

        // Performing some operations with the stringQueue
        for (int i = 0; i < 5; i++) {
            String str = stringQueue.take();
            System.out.println("Processed: " + str);
        }

        // Adding more unrelated operations
        int randomNumber = random.nextInt(100);
        System.out.println("Random number generated: " + randomNumber);

        /* read */ int value = queue.take();
        System.out.println("Value read from the queue: " + value);

        // Adding final unrelated operations
        for (int i = 0; i < 3; i++) {
            queue.put(i + 10);
        }
        while (!queue.isEmpty()) {
            System.out.println("Remaining in queue: " + queue.take());
        }
    }
}