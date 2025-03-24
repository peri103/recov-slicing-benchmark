import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize a DelayQueue
        DelayQueue<DelayedElement> queue = new DelayQueue<>();

        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000); // 1 second delay

        // Write the element to the queue
        /* write */ queue.put(element);

        // Perform some unrelated operations to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Print the list
        System.out.println("List contents:");
        for (int value : list) {
            System.out.println(value);
        }

        // Simulate some processing time
        Thread.sleep(500);

        // Read the element from the queue
        /* read */ DelayedElement takenElement = queue.take();

        // Print the taken element
        System.out.println("Element taken: " + takenElement);

        // More unrelated operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Print the string list
        System.out.println("String list contents:");
        for (String str : stringList) {
            System.out.println(str);
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

    @Override
    public String toString() {
        return "DelayedElement{" +
                "delayTime=" + delayTime +
                ", startTime=" + startTime +
                '}';
    }
}