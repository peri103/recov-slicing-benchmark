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

        // Additional code to make the program more complex
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        anotherQueue.put(anotherElement);

        // Simulate some processing
        for (int i = 0; i < 5; i++) {
            System.out.println("Processing iteration " + i);
            Thread.sleep(500); // Sleep for 500 milliseconds
        }

        // Take elements from the queues
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from the first queue");

        DelayedElement anotherTakenElement = anotherQueue.take();
        System.out.println("Element taken from the second queue");

        // More complex operations
        DelayQueue<DelayedElement> thirdQueue = new DelayQueue<>();
        for (int i = 0; i < 3; i++) {
            DelayedElement newElement = new DelayedElement((i + 1) * 1000); // 1, 2, 3 seconds delay
            thirdQueue.put(newElement);
        }

        while (!thirdQueue.isEmpty()) {
            DelayedElement elem = thirdQueue.take();
            System.out.println("Element with delay " + elem.getDelay(TimeUnit.MILLISECONDS) + " ms taken from the third queue");
        }
    }
}