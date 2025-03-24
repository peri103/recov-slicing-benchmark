import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long triggerTime;

    public DelayedElement(long delayInMillis) {
        this.triggerTime = System.currentTimeMillis() + delayInMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = triggerTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.triggerTime, ((DelayedElement) o).triggerTime);
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

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing unrelated operation " + i);
            Thread.sleep(500); // Simulate some work
        }

        // Take the element from the original queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue");

        // Additional code to process the taken element
        if (takenElement != null) {
            System.out.println("Processing the taken element");
        }

        // Take the element from the another queue
        DelayedElement anotherTakenElement = anotherQueue.take();
        System.out.println("Another element taken from queue");

        // Additional code to process the another taken element
        if (anotherTakenElement != null) {
            System.out.println("Processing the another taken element");
        }
    }
}