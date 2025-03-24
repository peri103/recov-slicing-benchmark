import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Adding elements to the LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        /* write */ queue.put(element);

        // Iterating through the ArrayList and printing elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Iterating through the LinkedList and printing elements
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Creating a new DelayedElement with a different delay
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        queue.put(anotherElement);

        // Taking elements from the queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken: " + takenElement.getDelay(TimeUnit.MILLISECONDS));

        // Taking another element from the queue
        DelayedElement anotherTakenElement = queue.take();
        System.out.println("Another element taken: " + anotherTakenElement.getDelay(TimeUnit.MILLISECONDS));

        // Adding more elements to the ArrayList
        list.add(40);
        list.add(50);

        // Printing the updated ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated ArrayList element: " + list.get(i));
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
}