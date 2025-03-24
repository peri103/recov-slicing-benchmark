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

        // Additional code to make the program more complex
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        System.out.println("Processing ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        System.out.println("Processing LinkedList:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        // Additional DelayQueue operations
        DelayedElement anotherElement = new DelayedElement(2000); // 2 second delay
        queue.put(anotherElement);

        // More complex operations
        ArrayList<DelayedElement> delayedElements = new ArrayList<>();
        delayedElements.add(new DelayedElement(3000));
        delayedElements.add(new DelayedElement(4000));

        for (DelayedElement e : delayedElements) {
            queue.put(e);
        }

        // Simulate some processing time
        Thread.sleep(1500);

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue with delay: " + takenElement.getDelay(TimeUnit.MILLISECONDS));

        // Final processing
        System.out.println("Remaining elements in queue: " + queue.size());
        while (!queue.isEmpty()) {
            DelayedElement e = queue.take();
            System.out.println("Processed element with delay: " + e.getDelay(TimeUnit.MILLISECONDS));
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
        return unit.convert(delayTime - elapsedTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }
}