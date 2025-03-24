import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        // Generate and add random numbers to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        // Add numbers to the queue
        for (Integer num : numbers) {
            queue.offer(num);
        }

        /* write */ queue.offer(1);

        // Perform some operations with the queue
        int sum = 0;
        Integer element;
        while ((element = queue.poll()) != null) {
            sum += element;
        }

        // Add more numbers to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(100));
        }

        // Add numbers to the queue again
        for (Integer num : numbers) {
            queue.offer(num);
        }

        // Perform some more operations with the queue
        int count = 0;
        while ((element = queue.poll()) != null) {
            if (element % 2 == 0) {
                count++;
            }
        }

        /* read */ Integer value = queue.poll();
        System.out.println("The value read from the queue: " + value);
        System.out.println("Sum of all elements in the queue: " + sum);
        System.out.println("Count of even elements in the queue: " + count);
    }
}