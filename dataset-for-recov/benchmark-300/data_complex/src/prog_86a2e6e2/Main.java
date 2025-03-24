import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private long startTime;
    private int value;

    public DelayedElement(int value, long delayInMillis) {
        this.value = value;
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

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            DelayedElement delayedElement = new DelayedElement(i * 10, 1000);
            list.add(delayedElement);
            linkedList.add(delayedElement);
        }

        // Adding elements from the ArrayList to the DelayQueue
        for (DelayedElement element : list) {
            queue.put(element);
        }

        // Adding elements from the LinkedList to the DelayQueue
        for (DelayedElement element : linkedList) {
            queue.put(element);
        }

        /* write */ queue.put(new DelayedElement(42, 1000)); // 1000 milliseconds delay

        // Processing elements from the DelayQueue
        while (!queue.isEmpty()) {
            DelayedElement element = queue.take();
            System.out.println("Processed element: " + element.getValue());
        }

        /* read */ DelayedElement element = queue.take();
        System.out.println("Final element: " + element.getValue());
    }
}