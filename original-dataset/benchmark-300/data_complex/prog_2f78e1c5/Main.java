import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize the DelayQueue
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        
        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);
        
        // Perform some unrelated operations to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Print the numbers list
        System.out.println("Numbers list:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // Simulate some processing time
        Thread.sleep(500);
        
        // Take the element from the queue after the delay
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue with delay: " + takenElement.getDelay(TimeUnit.MILLISECONDS) + " ms");
        
        // Perform more unrelated operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        
        // Print the strings list
        System.out.println("Strings list:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

class DelayedElement implements Delayed {
    private long startTime;

    public DelayedElement(long delayInMilliseconds) {
        this.startTime = System.currentTimeMillis() + delayInMilliseconds;
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