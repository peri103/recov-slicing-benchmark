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

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            DelayedElement element = new DelayedElement("Element " + i, 1000 * (i + 1));
            list.add(element);
            linkedList.add(element);
        }

        // Writing to the DelayQueue
        DelayedElement element = new DelayedElement("Test Data", 1000); // 1 second delay
        /* write */ queue.put(element);

        // Processing elements from the ArrayList
        for (DelayedElement e : list) {
            System.out.println("Processing: " + e.getData());
        }

        // Reading from the DelayQueue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken from queue: " + takenElement.getData());

        // Processing elements from the LinkedList
        for (DelayedElement e : linkedList) {
            System.out.println("Processing: " + e.getData());
        }

        // Adding more elements to the DelayQueue
        for (int i = 0; i < 3; i++) {
            DelayedElement newElement = new DelayedElement("New Element " + i, 2000 * (i + 1));
            queue.put(newElement);
        }

        // Taking elements from the DelayQueue
        while (!queue.isEmpty()) {
            DelayedElement e = queue.take();
            System.out.println("Taken from queue: " + e.getData());
        }
    }
}