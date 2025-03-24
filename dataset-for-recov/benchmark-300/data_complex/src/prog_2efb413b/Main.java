import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional complex code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        // Simulate some processing
        for (int num : numbers) {
            System.out.println("Processing number: " + num);
            Thread.sleep(100); // Simulate delay
        }

        // More complex operations
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add("String " + i);
        }

        for (String str : strings) {
            System.out.println("Processing string: " + str);
            Thread.sleep(150); // Simulate delay
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken: " + takenElement.getDelay(TimeUnit.MILLISECONDS) + " ms");
    }
}

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long elapsedTime = System.currentTimeMillis() - startTime;
        return unit.convert(delayTime - elapsedTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }
}