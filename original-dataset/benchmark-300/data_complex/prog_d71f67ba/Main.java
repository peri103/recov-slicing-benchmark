import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

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

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        System.out.println("Numbers list:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Simulate some processing
        Thread.sleep(500);

        // More unrelated code
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        System.out.println("Strings list:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Simulate some more processing
        Thread.sleep(500);

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue");
    }
}