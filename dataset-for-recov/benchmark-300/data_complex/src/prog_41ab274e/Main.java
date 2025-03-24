import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private long startTime;
    private String data;

    public DelayedElement(String data, long delayInMillis) {
        this.data = data;
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

    public String getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        list.add(new DelayedElement("Element1", 2000));
        list.add(new DelayedElement("Element2", 3000));

        // Adding elements to the LinkedList
        linkedList.add(new DelayedElement("Element3", 4000));
        linkedList.add(new DelayedElement("Element4", 5000));

        // Writing to the DelayQueue
        DelayedElement element = new DelayedElement("Test", 1000); // 1 second delay
        /* write */ queue.put(element);

        // Reading from the ArrayList and LinkedList
        for (DelayedElement e : list) {
            System.out.println("ArrayList Element: " + e.getData());
        }

        for (DelayedElement e : linkedList) {
            System.out.println("LinkedList Element: " + e.getData());
        }

        // Reading from the DelayQueue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken from DelayQueue: " + takenElement.getData());

        // Adding more elements to the DelayQueue
        queue.put(new DelayedElement("Element5", 6000));
        queue.put(new DelayedElement("Element6", 7000));

        // Reading all remaining elements from the DelayQueue
        while (!queue.isEmpty()) {
            DelayedElement e = queue.take();
            System.out.println("Remaining Element: " + e.getData());
        }
    }
}