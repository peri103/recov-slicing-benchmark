import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Random random = new Random();

        // Adding some random values to the blocking queue
        for (int i = 0; i < 5; i++) {
            blockingQueue.offer(random.nextInt(100));
        }

        // Processing the blocking queue
        while (!blockingQueue.isEmpty()) {
            System.out.println("Processing value: " + blockingQueue.poll());
        }

        /* write */ queue.offer(42);

        // Simulating some other operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Adding some more values to the blocking queue
        for (int i = 0; i < 3; i++) {
            blockingQueue.offer(random.nextInt(50));
        }

        // Processing the blocking queue again
        while (!blockingQueue.isEmpty()) {
            System.out.println("Processing new value: " + blockingQueue.poll());
        }

        /* read */ Integer value = queue.poll();
        System.out.println("Value from LinkedTransferQueue: " + value);

        // Final operation: calculating factorial of 5
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}