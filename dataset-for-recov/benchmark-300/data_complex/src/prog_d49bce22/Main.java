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
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }

        System.out.println("List contents:");
        for (int val : list) {
            System.out.println(val);
        }

        // Simulate some other operations
        int sum = 0;
        for (int val : list) {
            sum += val;
        }
        System.out.println("Sum of list elements: " + sum);

        // More operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        System.out.println("String list contents:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Finally, read from the DelayQueue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);
    }
}

class DelayedElement implements Delayed {
    private final long expiryTime;

    public DelayedElement(long delay) {
        this.expiryTime = System.currentTimeMillis() + delay;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = expiryTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.expiryTime, ((DelayedElement) o).expiryTime);
    }

    @Override
    public String toString() {
        return "DelayedElement{" +
                "expiryTime=" + expiryTime +
                '}';
    }
}