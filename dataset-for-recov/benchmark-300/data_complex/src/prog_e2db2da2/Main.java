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
                ", startTime=" + startTime +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<DelayedElement> elements = new ArrayList<>();

        // Adding multiple elements with different delays
        for (int i = 1; i <= 5; i++) {
            DelayedElement element = new DelayedElement(i * 1000); // 1, 2, 3, 4, 5 seconds delay
            elements.add(element);
        }

        // Adding elements to the queue
        for (DelayedElement element : elements) {
            queue.put(element);
        }

        // Performing some unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Calculating the sum of numbers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Taking elements from the queue
        /* write */ queue.put(elements.get(0));
        /* read */ DelayedElement takenElement = queue.take();

        System.out.println("Element taken: " + takenElement);

        // More unrelated operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        for (String str : strings) {
            System.out.println(str);
        }
    }
}