import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addToQueue(String data, long delayInMillis) {
        /* write */ queue.put(new DelayedElement(delayInMillis, data));
    }

    public String takeFromQueue() throws InterruptedException {
        /* read */ DelayedElement element = queue.take();
        return element.getData();
    }
}
