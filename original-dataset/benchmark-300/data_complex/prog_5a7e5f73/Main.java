import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

    public DelayedElement(long delayMillis) {
        this.delayTime = delayMillis;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime + delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        /* write */ queue.put(element);
        list.add(element);
        linkedList.add(element);

        for (int i = 0; i < 5; i++) {
            DelayedElement newElement = new DelayedElement((i + 1) * 1000);
            queue.put(newElement);
            list.add(newElement);
            linkedList.add(newElement);
        }

        for (DelayedElement e : list) {
            System.out.println("Element in list with delay: " + e.getDelay(TimeUnit.MILLISECONDS));
        }

        for (DelayedElement e : linkedList) {
            System.out.println("Element in linked list with delay: " + e.getDelay(TimeUnit.MILLISECONDS));
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue with delay: " + takenElement.getDelay(TimeUnit.MILLISECONDS));
    }
}