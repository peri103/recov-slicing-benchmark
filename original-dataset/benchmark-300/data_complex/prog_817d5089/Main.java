import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        AtomicInteger counter = new AtomicInteger(0);

        // Adding some initial elements to the deque
        deque.addFirst("First Element");
        deque.addFirst("Second Element");

        // Incrementing the counter
        counter.incrementAndGet();
        counter.incrementAndGet();

        // Performing the write operation
        /* write */ deque.addLast("Hello, World!");

        // Performing some unrelated operations
        int currentCount = counter.get();
        System.out.println("Current counter value: " + currentCount);

        // Adding more elements to the deque
        deque.addLast("Third Element");
        deque.addLast("Fourth Element");

        // Performing the read operation
        /* read */ String value = deque.peekLast();
        System.out.println("Last element in deque: " + value);

        // Printing all elements in the deque
        System.out.println("All elements in deque:");
        for (String element : deque) {
            System.out.println(element);
        }

        // Final counter value
        System.out.println("Final counter value: " + counter.get());
    }
}