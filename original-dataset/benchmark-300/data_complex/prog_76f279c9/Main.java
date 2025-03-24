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
    public int compareTo(Delayed o) {
        return Long.compare(this.triggerTime, ((DelayedElement) o).triggerTime);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        list.add(new DelayedElement(500));
        linkedList.add(new DelayedElement(1500));

        /* write */ queue.put(new DelayedElement(1000));

        // Processing elements in the list
        for (DelayedElement e : list) {
            queue.put(e);
        }

        // Processing elements in the linkedList
        for (DelayedElement e : linkedList) {
            queue.put(e);
        }

        // Adding more elements to the queue
        queue.put(new DelayedElement(2000));
        queue.put(new DelayedElement(3000));

        // Taking elements from the queue
        while (!queue.isEmpty()) {
            /* read */ DelayedElement element = queue.take();
            System.out.println("Element taken from the queue with delay: " + element.getDelay(TimeUnit.MILLISECONDS));
        }
    }
}