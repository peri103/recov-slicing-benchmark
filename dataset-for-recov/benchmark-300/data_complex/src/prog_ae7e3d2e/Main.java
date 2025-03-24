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
        List<DelayedElement> elements = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            elements.add(new DelayedElement((i + 1) * 1000));
        }
        for (DelayedElement e : elements) {
            queue.put(e);
        }

        // Simulate some processing
        for (int i = 0; i < 3; i++) {
            System.out.println("Processing other tasks...");
            Thread.sleep(500);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element: " + takenElement);

        // More additional code
        for (int i = 0; i < elements.size(); i++) {
            System.out.println("Remaining element: " + queue.take());
        }
    }
}