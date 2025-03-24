import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addElement(long delayInMillis) {
        /* write */ queue.put(new DelayedElement(delayInMillis));
    }

    public DelayQueue<DelayedElement> getQueue() {
        return queue;
    }
}
