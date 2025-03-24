import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize DelayQueue and DelayedElement
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional code to make the program more complex
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Add elements to LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        // Print elements from ArrayList
        System.out.println("ArrayList elements:");
        for (int num : list) {
            System.out.println(num);
        }

        // Print elements from LinkedList
        System.out.println("LinkedList elements:");
        for (String str : linkedList) {
            System.out.println(str);
        }

        // Simulate some processing time
        Thread.sleep(500);

        // Read from DelayQueue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from DelayQueue: " + takenElement);

        // More complex operations
        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        delayedList.add(new DelayedElement(2000));
        delayedList.add(new DelayedElement(3000));

        // Add elements from delayedList to queue
        for (DelayedElement elem : delayedList) {
            queue.put(elem);
        }

        // Take elements from queue and print them
        System.out.println("Elements taken from DelayQueue after additional operations:");
        while (!queue.isEmpty()) {
            DelayedElement elem = queue.take();
            System.out.println(elem);
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