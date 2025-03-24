import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long startTime;
    private long delayTime;

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

    @Override
    public String toString() {
        return "DelayedElement{" +
                "delayTime=" + delayTime +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<DelayedElement> elements = new ArrayList<>();

        // Add multiple elements to the queue
        for (int i = 0; i < 5; i++) {
            DelayedElement element = new DelayedElement(1000 * (i + 1)); // Different delays
            elements.add(element);
            queue.put(element);
        }

        // Perform some unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Print the numbers
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Write the element to the queue
        DelayedElement element = new DelayedElement(500); // 0.5 second delay
        /* write */ queue.put(element);

        // More unrelated operations
        String message = "Processing delayed elements...";
        System.out.println(message);

        // Read the element from the queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element: " + takenElement);

        // Process the remaining elements in the queue
        while (!queue.isEmpty()) {
            DelayedElement remainingElement = queue.take();
            System.out.println("Remaining element: " + remainingElement);
        }
    }
}