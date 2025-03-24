import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void writeToQueue(int value, long delayInMillis) {
        /* write */ queue.put(new DelayedElement(value, delayInMillis));
    }

    public int readFromQueue() throws InterruptedException {
        /* read */ DelayedElement element = queue.take();
        return element.getValue();
    }
}
