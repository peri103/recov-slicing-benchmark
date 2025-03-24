import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long triggerTime;

    public DelayedElement(long delayInMillis) {
        this.triggerTime = System.currentTimeMillis() + delayInMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(triggerTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return Long.compare(this.triggerTime, ((DelayedElement) other).triggerTime);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("List contents:");
        for (int num : list) {
            System.out.println(num);
        }

        // Simulate some processing time
        Thread.sleep(500);

        // More complex operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        System.out.println("String list contents:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Finally, read from the queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue");
    }
}