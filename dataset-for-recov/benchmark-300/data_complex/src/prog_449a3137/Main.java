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
        this.startTime = System.currentTimeMillis() + delayTime;
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
                "delayTime=" + delayTime +
                ", startTime=" + startTime +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(element);
        linkedList.add(element);

        /* write */ queue.put(element);

        // Simulating some other operations
        for (int i = 0; i < 5; i++) {
            DelayedElement newElement = new DelayedElement(1000 * (i + 1));
            queue.put(newElement);
            list.add(newElement);
            linkedList.add(newElement);
        }

        // Processing elements from the LinkedList
        for (DelayedElement e : linkedList) {
            System.out.println("Processing: " + e);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken Element: " + takenElement);

        // Additional operations on the ArrayList
        for (DelayedElement e : list) {
            System.out.println("List Element: " + e);
        }
    }
}