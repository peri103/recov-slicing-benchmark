import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        
        /* write */ queue.put(element);
        
        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        System.out.println("Numbers list:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Simulate some processing time
        Thread.sleep(500);
        
        // More unrelated code
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        System.out.println("Fruits list:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // Simulate more processing time
        Thread.sleep(500);
        
        /* read */ DelayedElement takenElement = queue.take();
        
        System.out.println("Element taken from queue: " + takenElement);
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