import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        
        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000);
        
        /* write */ queue.put(element);
        
        // Additional code to make the program more complex
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }
        
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }
        
        // More complex operations
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ArrayList elements: " + sum);
        
        linkedList.removeFirst();
        System.out.println("LinkedList after removing first element: " + linkedList);
        
        /* read */ DelayedElement takenElement = queue.take();
        
        System.out.println("Element taken from queue: " + takenElement);
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
    
    @Override
    public String toString() {
        return "DelayedElement{" +
                "startTime=" + startTime +
                '}';
    }
}