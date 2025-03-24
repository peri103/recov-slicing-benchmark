import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;
    private final String name;

    public DelayedElement(long delayTime, String name) {
        this.delayTime = delayTime;
        this.startTime = System.currentTimeMillis();
        this.name = name;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime + delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<DelayedElement> elements = new ArrayList<>();

        // Adding multiple elements with different delays
        elements.add(new DelayedElement(2000, "Element 1"));
        elements.add(new DelayedElement(1000, "Element 2"));
        elements.add(new DelayedElement(3000, "Element 3"));

        // Adding elements to the queue
        for (DelayedElement element : elements) {
            queue.put(element);
        }

        // Writing the first element
        DelayedElement firstElement = elements.get(0);
        /* write */ queue.put(firstElement);

        // Simulating some other operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Performing some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Reading the first element from the queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken after delay: " + takenElement);

        // Adding more elements to the queue
        queue.put(new DelayedElement(500, "Element 4"));
        queue.put(new DelayedElement(1500, "Element 5"));

        // Taking more elements from the queue
        while (!queue.isEmpty()) {
            DelayedElement element = queue.take();
            System.out.println("Element taken: " + element);
        }
    }
}