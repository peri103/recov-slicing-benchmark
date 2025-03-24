import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize a DelayQueue
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        
        // Create a list to store some additional data
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        
        // Print the numbers list
        System.out.println("Numbers list: " + numbers);
        
        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000);
        
        // Write the element to the DelayQueue
        /* write */ queue.put(element);
        
        // Simulate some other operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Read the element from the DelayQueue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken: " + takenElement);
        
        // Perform some additional operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

class DelayedElement implements Delayed {
    private long startTime;

    public DelayedElement(long delayInMillis) {
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
                "startTime=" + startTime +
                '}';
    }
}