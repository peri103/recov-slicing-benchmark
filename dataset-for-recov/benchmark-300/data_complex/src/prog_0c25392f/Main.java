import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;
    private final int id;

    public DelayedElement(long delayMillis, int id) {
        this.delayTime = delayMillis;
        this.startTime = System.currentTimeMillis();
        this.id = id;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long elapsed = System.currentTimeMillis() - startTime;
        return unit.convert(delayTime - elapsed, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return "DelayedElement{id=" + id + "}";
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        Random random = new Random();
        List<DelayedElement> elements = new ArrayList<>();

        // Generate and add multiple delayed elements to the queue
        for (int i = 0; i < 5; i++) {
            long delay = random.nextInt(5000) + 1000; // Random delay between 1 and 6 seconds
            DelayedElement element = new DelayedElement(delay, i);
            elements.add(element);
            queue.put(element);
            System.out.println("Added element with id " + i + " and delay " + delay + " ms");
        }

        // Perform some unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Generated random numbers: " + numbers);

        // Find the maximum number in the list
        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("Maximum number in the list: " + max);

        // Write the first element to the queue
        DelayedElement firstElement = elements.get(0);
        /* write */ queue.put(firstElement);
        System.out.println("Re-added first element to the queue: " + firstElement);

        // Perform some more unrelated operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        System.out.println("List of strings: " + strings);

        // Read the element from the queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);

        // Perform final unrelated operations
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            doubles.add(random.nextDouble() * 100);
        }
        System.out.println("Generated random doubles: " + doubles);
    }
}