import java.util.concurrent.DelayQueue;

public class QueueManager {
    private final DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addElement(long delayTime) {
        /* write */ queue.put(new DelayedElement(delayTime));
    }

    public DelayedElement takeElement() throws InterruptedException {
        return queue.take();
    }
}
