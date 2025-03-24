import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long delayTime;

    public DelayedElement(long delayTime) {
        this.delayTime = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.delayTime, ((DelayedElement) o).delayTime);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Adding more complexity
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        anotherQueue.put(anotherElement);

        // Unrelated code
        System.out.println("Waiting for elements to be taken...");
        Thread.sleep(1500); // Sleep for 1.5 seconds

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from the queue");

        // More unrelated code
        DelayedElement takenAnotherElement = anotherQueue.take();
        System.out.println("Another element taken from the queue");
    }
}