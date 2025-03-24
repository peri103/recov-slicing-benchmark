import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long startTime;
    private int value;

    public DelayedElement(int value, long delayInMillis) {
        this.value = value;
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

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(42, 1000); // Delay of 1 second
        /* write */ queue.put(element);

        // Additional complex code
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(100, 2000); // Delay of 2 seconds
        anotherQueue.put(anotherElement);

        // Simulate some other operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing operation " + i);
            Thread.sleep(500); // Simulate time-consuming operations
        }

        // Read from the original queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Value from original queue: " + takenElement.getValue());

        // Read from the additional queue
        DelayedElement takenAnotherElement = anotherQueue.take();
        System.out.println("Value from additional queue: " + takenAnotherElement.getValue());
    }
}