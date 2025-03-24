import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional complex code
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList value: " + list.get(i));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }

        // More complex operations
        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            DelayedElement newElement = new DelayedElement(500 * (i + 1)); // 0.5s, 1s, 1.5s delays
            delayedList.add(newElement);
            queue.put(newElement);
        }

        for (DelayedElement e : delayedList) {
            System.out.println("Added DelayedElement with delay: " + e.getDelay(TimeUnit.MILLISECONDS) + "ms");
        }

        // Reading the original element after some delay
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken after delay: " + takenElement);

        // Additional operations after reading
        for (int i = 0; i < delayedList.size(); i++) {
            DelayedElement e = queue.take();
            System.out.println("Taken DelayedElement with delay: " + e.getDelay(TimeUnit.MILLISECONDS) + "ms");
        }
    }
}

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

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

    @Override
    public String toString() {
        return "DelayedElement{" +
                "delayTime=" + delayTime +
                ", startTime=" + startTime +
                '}';
    }
}