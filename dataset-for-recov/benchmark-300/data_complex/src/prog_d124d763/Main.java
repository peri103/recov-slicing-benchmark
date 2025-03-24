import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        Random random = new Random();
        List<DelayedElement> elements = new ArrayList<>();

        // Generate and add multiple delayed elements to the queue
        for (int i = 0; i < 5; i++) {
            long delay = random.nextInt(5000) + 1000; // Random delay between 1 and 6 seconds
            DelayedElement element = new DelayedElement(delay);
            elements.add(element);
            queue.put(element);
            System.out.println("Added element with delay: " + delay + " ms");
        }

        // Perform some unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Generated numbers: " + numbers);

        // Write the specific element to the queue
        DelayedElement specificElement = new DelayedElement(3000); // 3 seconds delay
        /* write */ queue.put(specificElement);
        System.out.println("Added specific element with delay: 3000 ms");

        // More unrelated operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Read the specific element from the queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);

        // Additional operations
        System.out.println("Remaining elements in queue: " + queue.size());
        for (DelayedElement element : elements) {
            if (queue.contains(element)) {
                System.out.println("Element with delay " + element.getDelay(TimeUnit.MILLISECONDS) + " ms is still in queue");
            }
        }
    }
}

class DelayedElement implements Delayed {
    private long delayTime;
    private long startTime;

    public DelayedElement(long delayInMillis) {
        this.delayTime = delayInMillis;
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

    @Override
    public String toString() {
        return "DelayedElement{" +
                "delayTime=" + delayTime +
                ", startTime=" + startTime +
                '}';
    }
}