import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private long delayTime;
    private long startTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
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
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 20);
        }

        /* write */ queue.put(element);

        // Processing ArrayList elements
        for (Integer value : list) {
            System.out.println("ArrayList value: " + value);
        }

        // Processing LinkedList elements
        for (Integer value : linkedList) {
            System.out.println("LinkedList value: " + value);
        }

        // Simulating some delay
        Thread.sleep(1500);

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from the queue");
    }
}