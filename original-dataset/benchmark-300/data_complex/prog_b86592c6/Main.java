import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to ArrayList and LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        // Writing to the DelayQueue
        /* write */ queue.put(new DelayedElement(1000)); // 1 second delay

        // Processing ArrayList
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Processing LinkedList
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading from the DelayQueue
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from queue: " + element);

        // Additional operations
        list.add(40);
        linkedList.add("Fourth");

        // Printing updated lists
        System.out.println("Updated ArrayList: " + list);
        System.out.println("Updated LinkedList: " + linkedList);
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