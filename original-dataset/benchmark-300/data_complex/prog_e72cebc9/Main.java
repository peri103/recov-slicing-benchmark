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
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        /* write */ queue.put(new DelayedElement(1000));
        System.out.println("Added element to the queue");
        for (int num : numbers) {
            System.out.println("Processing number: " + num);
        }
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from queue");
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 5);
        }
        for (int num : numbers) {
            System.out.println("Updated number: " + num);
        }
    }
}