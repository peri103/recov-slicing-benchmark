import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long delayTime;
    private long startTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long elapsedTime = System.currentTimeMillis() - startTime;
        long remainingTime = delayTime - elapsedTime;
        return unit.convert(remainingTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return "DelayedElement{" +
                "delayTime=" + delayTime +
                ", startTime=" + startTime +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        // Simulate some processing time
        Thread.sleep(500);

        // Add more elements to the queue
        queue.put(new DelayedElement(2000)); // 2 seconds delay
        queue.put(new DelayedElement(3000)); // 3 seconds delay

        // Take elements from the queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element: " + takenElement);

        // More complex processing
        List<DelayedElement> elements = new ArrayList<>();
        while (!queue.isEmpty()) {
            elements.add(queue.take());
        }

        for (DelayedElement e : elements) {
            System.out.println("Remaining element: " + e);
        }
    }
}