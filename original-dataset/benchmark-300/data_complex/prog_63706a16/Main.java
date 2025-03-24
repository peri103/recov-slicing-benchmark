import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long delayTime;
    private long startTime;

    public DelayedElement(long delayInMillis) {
        this.delayTime = delayInMillis;
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

        // Additional complex code
        List<DelayedElement> elementsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            elementsList.add(new DelayedElement((i + 1) * 1000));
        }
        for (DelayedElement e : elementsList) {
            queue.put(e);
        }

        // Simulate some processing
        Thread.sleep(500);

        // Take elements from the queue
        for (int i = 0; i < elementsList.size(); i++) {
            DelayedElement taken = queue.take();
            System.out.println("Taken: " + taken);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Main taken element: " + takenElement);

        // More unrelated code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}