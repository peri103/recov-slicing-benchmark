import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

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

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        // Creating a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000);
        /* write */ queue.put(element);

        // Iterating through the ArrayList and printing elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Iterating through the LinkedList and printing elements
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Taking the element from the DelayQueue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element from DelayQueue: " + takenElement);

        // Adding more elements to the ArrayList
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }

        // Printing the updated ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated ArrayList element: " + list.get(i));
        }
    }
}