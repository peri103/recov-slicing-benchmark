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

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        System.out.println("List contents: " + list);

        // Simulate some processing time
        Thread.sleep(500);

        // Add more elements to the queue
        queue.put(new DelayedElement(2000));
        queue.put(new DelayedElement(3000));

        // Perform some unrelated operations
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list elements: " + sum);

        // More processing time
        Thread.sleep(1000);

        // Retrieve elements from the queue
        while (!queue.isEmpty()) {
            DelayedElement takenElement = queue.take();
            System.out.println("Element taken from queue: " + takenElement);
        }

        // Final read operation
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Final element taken from queue: " + takenElement);
    }
}

class DelayedElement implements Delayed {
    private final long startTime;
    private final long delayMillis;

    public DelayedElement(long delayMillis) {
        this.delayMillis = delayMillis;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime + delayMillis - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.startTime + this.delayMillis, ((DelayedElement) o).startTime + ((DelayedElement) o).delayMillis);
    }

    @Override
    public String toString() {
        return "DelayedElement{" +
                "startTime=" + startTime +
                ", delayMillis=" + delayMillis +
                '}';
    }
}