import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime + delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
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
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        // Additional code to make the program more complex
        List<DelayedElement> elementsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            elementsList.add(new DelayedElement((i + 1) * 1000));
        }
        for (DelayedElement e : elementsList) {
            queue.put(e);
        }

        // Simulate some processing
        Thread.sleep(500);
        System.out.println("Processing some other tasks...");

        // More unrelated code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Taken element: " + takenElement);

        // Even more unrelated code
        System.out.println("Finalizing the program...");
    }
}