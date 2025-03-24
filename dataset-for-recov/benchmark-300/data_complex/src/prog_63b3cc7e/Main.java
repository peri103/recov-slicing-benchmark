import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private long delayTime;
    private long startTime;

    public DelayedElement(long delayMillis) {
        this.delayTime = delayMillis;
        this.startTime = System.currentTimeMillis() + delayMillis;
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

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Printing elements from the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Adding elements to the DelayQueue
        /* write */ queue.put(element);

        // Printing elements from the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        // Taking an element from the DelayQueue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue after delay");

        // Adding more elements to the ArrayList and LinkedList
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Printing elements from the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Printing elements from the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }
    }
}