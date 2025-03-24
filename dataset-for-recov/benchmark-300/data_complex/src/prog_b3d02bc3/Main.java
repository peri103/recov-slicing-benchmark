import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private long delayTime;

    public DelayedElement(long delayTime) {
        this.delayTime = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.delayTime, ((DelayedElement) o).delayTime);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        for (int i = 0; i < 5; i++) {
            DelayedElement element = new DelayedElement(1000 * (i + 1));
            list.add(element);
            linkedList.add(element);
        }

        /* write */ queue.put(new DelayedElement(1000)); // 1 second delay

        // Processing elements in the list
        for (DelayedElement e : list) {
            System.out.println("Processing element with delay: " + e.getDelay(TimeUnit.MILLISECONDS));
        }

        // Processing elements in the linkedList
        for (DelayedElement e : linkedList) {
            System.out.println("Processing linked list element with delay: " + e.getDelay(TimeUnit.MILLISECONDS));
        }

        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from the queue");

        // Additional processing
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i * 10);
        }

        for (int i : intList) {
            System.out.println("Integer value: " + i);
        }
    }
}