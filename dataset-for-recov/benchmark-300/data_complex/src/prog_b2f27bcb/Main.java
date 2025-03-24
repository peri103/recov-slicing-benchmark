import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize a DelayQueue
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        
        // Initialize other collections
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();
        
        // Add elements to the ArrayList and LinkedList
        list.add(element);
        linkedList.add(element);
        
        // Perform some operations on the collections
        for (DelayedElement e : list) {
            System.out.println("Processing element in ArrayList");
        }
        
        for (DelayedElement e : linkedList) {
            System.out.println("Processing element in LinkedList");
        }
        
        // Write the element to the DelayQueue
        /* write */ queue.put(element);
        
        // Simulate some other operations
        System.out.println("Simulating other operations...");
        Thread.sleep(500); // Sleep for 500ms
        
        // Read the element from the DelayQueue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue");
        
        // Perform additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}

class DelayedElement implements Delayed {
    private final long startTime;

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
}