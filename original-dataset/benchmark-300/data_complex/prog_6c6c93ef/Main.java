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

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        linkedList.add("First");
        linkedList.add("Second");

        // Writing to the DelayQueue
        /* write */ queue.put(new DelayedElement(1000)); // 1000 milliseconds delay

        // Performing some operations on the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading from the DelayQueue
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from queue after delay");

        // Adding more elements to the ArrayList and LinkedList
        list.add(30);
        linkedList.add("Third");

        // Printing the final state of the ArrayList and LinkedList
        System.out.println("Final ArrayList: " + list);
        System.out.println("Final LinkedList: " + linkedList);
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