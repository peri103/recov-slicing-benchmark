import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            DelayedElement element = new DelayedElement(1000 * (i + 1));
            list.add(element);
            linkedList.add(element);
        }

        // Writing to the DelayQueue
        /* write */ queue.put(new DelayedElement(1000)); // 1 second delay

        // Reading from the DelayQueue
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken after delay: " + element);

        // Adding elements from ArrayList to LinkedList
        for (DelayedElement e : list) {
            linkedList.add(e);
        }

        // Printing elements from LinkedList
        for (DelayedElement e : linkedList) {
            System.out.println("LinkedList element: " + e);
        }

        // Creating another DelayQueue and adding elements
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        for (int i = 0; i < 3; i++) {
            anotherQueue.put(new DelayedElement(2000 * (i + 1)));
        }

        // Taking elements from the second DelayQueue
        while (!anotherQueue.isEmpty()) {
            DelayedElement e = anotherQueue.take();
            System.out.println("Another queue element taken: " + e);
        }
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