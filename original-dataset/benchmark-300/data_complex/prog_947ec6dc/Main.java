import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private long startTime;
    private int value;

    public DelayedElement(long delay, int value) {
        this.startTime = System.currentTimeMillis() + delay;
        this.value = value;
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
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Writing to the DelayQueue
        /* write */ queue.put(new DelayedElement(1000, 42));

        // Processing the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Processing the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        // Reading from the DelayQueue
        /* read */ DelayedElement element = queue.take();
        System.out.println("DelayedElement value: " + element.getValue());

        // Additional complex operations
        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            delayedList.add(new DelayedElement(2000, i * 100));
        }

        for (DelayedElement de : delayedList) {
            queue.put(de);
        }

        while (!queue.isEmpty()) {
            DelayedElement de = queue.take();
            System.out.println("Additional DelayedElement value: " + de.getValue());
        }
    }
}