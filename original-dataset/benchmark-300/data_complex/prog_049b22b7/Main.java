import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.Random;

class DelayedElement implements Delayed {
    private long delayTime;
    private long startTime;
    private int id;

    public DelayedElement(long delayTime, int id) {
        this.delayTime = delayTime;
        this.startTime = System.currentTimeMillis() + delayTime;
        this.id = id;
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

    @Override
    public String toString() {
        return "DelayedElement with id: " + id + " and delay: " + delayTime;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        Random random = new Random();

        // Adding multiple elements with different delays
        for (int i = 0; i < 5; i++) {
            long delay = random.nextInt(5000) + 1000; // Random delay between 1 and 6 seconds
            DelayedElement element = new DelayedElement(delay, i);
            queue.put(element);
            System.out.println("Added: " + element);
        }

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += random.nextInt(100);
        }
        System.out.println("Sum of random numbers: " + sum);

        // Taking the first element from the queue
        /* write */ queue.put(new DelayedElement(1000, 99)); // Adding one more element with a fixed delay
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken: " + takenElement);

        // Processing remaining elements in the queue
        while (!queue.isEmpty()) {
            DelayedElement element = queue.take();
            System.out.println("Processed: " + element);
        }
    }
}