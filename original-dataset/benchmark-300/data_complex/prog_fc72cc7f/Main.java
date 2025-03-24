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

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        for (String str : linkedList) {
            list.add(str.length());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Length of " + linkedList.get(i) + " is " + list.get(i));
        }

        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        delayedList.add(new DelayedElement(2000));
        delayedList.add(new DelayedElement(3000));

        for (DelayedElement delayedElement : delayedList) {
            queue.put(delayedElement);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);

        for (int i = 0; i < delayedList.size(); i++) {
            System.out.println("Remaining delay for element " + i + ": " + delayedList.get(i).getDelay(TimeUnit.MILLISECONDS) + " ms");
        }
    }
}

class DelayedElement implements Delayed {
    private long startTime;
    private long delay;

    public DelayedElement(long delay) {
        this.startTime = System.currentTimeMillis();
        this.delay = delay;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long elapsed = System.currentTimeMillis() - startTime;
        long remaining = delay - elapsed;
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long diff = this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS);
        return Long.compare(diff, 0);
    }

    @Override
    public String toString() {
        return "DelayedElement{" +
                "startTime=" + startTime +
                ", delay=" + delay +
                '}';
    }
}