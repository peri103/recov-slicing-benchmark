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

        System.out.println("Processing numbers list:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Simulate some delay
        Thread.sleep(500);

        // More complex code
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("From");
        strings.add("Java");

        System.out.println("Processing strings list:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Simulate some more delay
        Thread.sleep(500);

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken after delay: " + takenElement);
    }
}

class DelayedElement implements Delayed {
    private long startTime;

    public DelayedElement(long delayInMillis) {
        this.startTime = System.currentTimeMillis() + delayInMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.startTime, ((DelayedElement) o).startTime);
    }

    @Override
    public String toString() {
        return "DelayedElement{" +
                "startTime=" + startTime +
                '}';
    }
}