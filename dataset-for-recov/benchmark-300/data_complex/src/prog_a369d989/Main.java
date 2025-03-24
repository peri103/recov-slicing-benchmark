import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        // Writing to the DelayQueue
        /* write */ queue.put(new DelayedElement(1000)); // 1 second delay

        // Processing the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Processing the LinkedList
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading from the DelayQueue
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken after delay: " + element);

        // Additional complex operations
        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        delayedList.add(new DelayedElement(2000)); // 2 seconds delay
        delayedList.add(new DelayedElement(3000)); // 3 seconds delay

        for (DelayedElement delayedElement : delayedList) {
            queue.put(delayedElement);
        }

        while (!queue.isEmpty()) {
            DelayedElement takenElement = queue.take();
            System.out.println("Taken from queue: " + takenElement);
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