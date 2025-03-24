import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

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
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        anotherQueue.put(anotherElement);

        System.out.println("Waiting for the first element to be taken...");

        /* read */ DelayedElement takenElement = queue.take();

        System.out.println("Taken element: " + takenElement);

        // More unrelated code
        System.out.println("Waiting for the second element to be taken...");
        DelayedElement secondTakenElement = anotherQueue.take();
        System.out.println("Second taken element: " + secondTakenElement);

        // Even more unrelated code
        System.out.println("Creating a list of delayed elements...");
        DelayQueue<DelayedElement> listQueue = new DelayQueue<>();
        for (int i = 0; i < 5; i++) {
            listQueue.put(new DelayedElement(500 * (i + 1))); // 500ms, 1000ms, 1500ms, etc.
        }

        System.out.println("Taking elements from the list queue...");
        while (!listQueue.isEmpty()) {
            DelayedElement listElement = listQueue.take();
            System.out.println("List element taken: " + listElement);
        }
    }
}