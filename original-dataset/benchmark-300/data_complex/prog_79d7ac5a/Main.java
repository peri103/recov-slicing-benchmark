import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

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
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        /* write */ queue.put(new DelayedElement(1000));

        // Iterating through the ArrayList and printing elements
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Iterating through the LinkedList and printing elements
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from the queue");
    }
}