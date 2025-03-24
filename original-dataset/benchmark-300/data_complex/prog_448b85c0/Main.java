import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        BlockingQueue<Integer> anotherQueue = new ArrayBlockingQueue<>(10);
        Random random = new Random();

        // Insert some random values into anotherQueue
        for (int i = 0; i < 5; i++) {
            anotherQueue.put(random.nextInt(100));
        }

        /* write */ queue.put(42);

        // Process values from anotherQueue
        while (!anotherQueue.isEmpty()) {
            int val = anotherQueue.take();
            System.out.println("Processed value from anotherQueue: " + val);
        }

        // Simulate some other operations
        for (int i = 0; i < 3; i++) {
            System.out.println("Performing operation " + (i + 1));
        }

        /* read */ int value = queue.take();
        System.out.println("Value from queue: " + value);

        // More unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
    }
}