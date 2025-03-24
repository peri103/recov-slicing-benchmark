import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        AtomicInteger counter = new AtomicInteger(0);

        // Initialize a counter and increment it
        counter.set(10);
        counter.incrementAndGet();

        // Add some elements to the deque
        deque.addLast(100);
        deque.addLast(200);

        /* write */ deque.addFirst(42);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        try {
            /* read */ int value = deque.takeFirst();
            System.out.println("Value read from deque: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform more unrelated operations
        String message = "Hello, World!";
        System.out.println(message);

        // Check the counter value
        System.out.println("Counter value: " + counter.get());
    }
}