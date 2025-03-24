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
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add("Item " + i);
        }

        // Printing elements from the ArrayList
        System.out.println("Elements in ArrayList:");
        for (int num : list) {
            System.out.println(num);
        }

        // Printing elements from the LinkedList
        System.out.println("Elements in LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Simulating some other operations
        System.out.println("Performing some other operations...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Operation " + (i + 1));
            Thread.sleep(500); // Simulating time-consuming operations
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from the queue after delay.");

        // Additional operations after the read
        System.out.println("Performing additional operations...");
        for (int i = 0; i < 2; i++) {
            System.out.println("Additional Operation " + (i + 1));
            Thread.sleep(300); // Simulating more time-consuming operations
        }
    }
}