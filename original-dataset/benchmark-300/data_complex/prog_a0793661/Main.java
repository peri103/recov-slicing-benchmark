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

        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();
        list.add(element);
        linkedList.add(element);

        for (int i = 0; i < 5; i++) {
            DelayedElement newElement = new DelayedElement(1000 + i * 500);
            queue.put(newElement);
            list.add(newElement);
            linkedList.add(newElement);
        }

        for (DelayedElement e : list) {
            System.out.println("List element: " + e);
        }

        for (DelayedElement e : linkedList) {
            System.out.println("LinkedList element: " + e);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);

        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i * 10);
        }

        for (int i : intList) {
            System.out.println("Integer list element: " + i);
        }

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        for (String s : stringList) {
            System.out.println("String list element: " + s);
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
        long elapsedTime = System.currentTimeMillis() - startTime;
        long remainingTime = delayTime - elapsedTime;
        return unit.convert(remainingTime, TimeUnit.MILLISECONDS);
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