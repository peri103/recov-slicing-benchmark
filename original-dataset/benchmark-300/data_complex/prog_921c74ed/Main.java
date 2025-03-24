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
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        linkedList.add("First");
        linkedList.add("Second");

        // Creating a delayed element and putting it into the queue
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Processing the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Taking the delayed element from the queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken after delay: " + takenElement);

        // Adding more elements to the ArrayList
        list.add(30);
        list.add(40);

        // Printing the updated ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated ArrayList element: " + list.get(i));
        }
    }
}