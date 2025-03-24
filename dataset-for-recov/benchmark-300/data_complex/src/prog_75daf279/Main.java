import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

    public DelayedElement(long delayMillis) {
        this.delayTime = delayMillis;
        this.startTime = System.currentTimeMillis() + delayMillis;
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

        /* write */ queue.put(element);

        // Additional code to make the program more complex
        List<DelayedElement> elementsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            DelayedElement newElement = new DelayedElement((i + 1) * 1000);
            elementsList.add(newElement);
            queue.put(newElement);
        }

        // Print all elements in the list
        for (DelayedElement e : elementsList) {
            System.out.println("List element: " + e);
        }

        // Take elements from the queue
        for (int i = 0; i < elementsList.size(); i++) {
            DelayedElement takenElement = queue.take();
            System.out.println("Taken element: " + takenElement);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element: " + takenElement);

        // More unrelated code
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}