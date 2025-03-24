import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize the DelayQueue
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        
        // Add some unrelated code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        System.out.println("Generated numbers: " + numbers);

        // Perform some operations on the list
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        System.out.println("Even numbers: " + evenNumbers);

        // Write to the DelayQueue
        /* write */ queue.put(new DelayedElement(2000)); // Delay of 2 seconds

        // More unrelated code
        int sum = 0;
        for (int num : evenNumbers) {
            sum += num;
        }
        System.out.println("Sum of even numbers: " + sum);

        // Read from the DelayQueue
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from queue: " + element);

        // Additional complex code
        List<String> messages = new ArrayList<>();
        messages.add("Hello");
        messages.add("World");
        messages.add("From");
        messages.add("Java");

        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}

class DelayedElement implements Delayed {
    private long startTime;
    private long delay;

    public DelayedElement(long delay) {
        this.delay = delay;
        this.startTime = System.currentTimeMillis() + delay;
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
                "startTime=" + startTime +
                ", delay=" + delay +
                '}';
    }
}