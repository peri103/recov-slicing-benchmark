import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

    public DelayedElement(long delayMillis) {
        this.delayTime = delayMillis;
        this.startTime = System.currentTimeMillis();
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
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional complex code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        List<Integer> squaredNumbers = new ArrayList<>();
        for (int num : numbers) {
            squaredNumbers.add(num * num);
        }

        System.out.println("Squared numbers: " + squaredNumbers);

        // Simulating some other operations
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        anotherQueue.put(new DelayedElement(500)); // 0.5 second delay
        anotherQueue.take();
        System.out.println("Element taken from another queue");

        // More complex operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        for (String str : strings) {
            System.out.println(str);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue after delay");
    }
}