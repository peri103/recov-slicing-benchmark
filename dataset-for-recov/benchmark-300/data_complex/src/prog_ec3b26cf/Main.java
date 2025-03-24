import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Writing to the DelayQueue
        /* write */ queue.put(new DelayedElement(1000)); // 1000 milliseconds delay

        // Processing the ArrayList
        for (Integer value : list) {
            System.out.println("ArrayList value: " + value);
        }

        // Processing the LinkedList
        for (Integer value : linkedList) {
            System.out.println("LinkedList value: " + value);
        }

        // Reading from the DelayQueue
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from queue");

        // Additional complex operations
        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        delayedList.add(new DelayedElement(500));
        delayedList.add(new DelayedElement(1500));

        for (DelayedElement delayedElement : delayedList) {
            System.out.println("DelayedElement delay: " + delayedElement.getDelay(TimeUnit.MILLISECONDS));
        }
    }
}

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long expireTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.expireTime = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = expireTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.expireTime, ((DelayedElement) o).expireTime);
    }
}