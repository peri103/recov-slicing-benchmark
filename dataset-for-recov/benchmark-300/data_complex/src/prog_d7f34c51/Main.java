import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long delayTime;
    private long startTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.startTime = System.currentTimeMillis() + delayTime;
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
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional complex code
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        anotherQueue.put(anotherElement);

        // Simulate some other operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing operation " + i);
            Thread.sleep(500); // Simulate some delay
        }

        // Take element from the second queue
        DelayedElement takenAnotherElement = anotherQueue.take();
        System.out.println("Element taken from the second queue");

        // Take element from the first queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from the first queue");

        // More complex operations
        DelayQueue<DelayedElement> thirdQueue = new DelayQueue<>();
        for (int i = 0; i < 3; i++) {
            DelayedElement newElement = new DelayedElement(500 * (i + 1)); // 0.5, 1, 1.5 seconds delay
            thirdQueue.put(newElement);
        }

        while (!thirdQueue.isEmpty()) {
            DelayedElement e = thirdQueue.take();
            System.out.println("Element with delay " + e.getDelay(TimeUnit.MILLISECONDS) + " ms taken from the third queue");
        }
    }
}