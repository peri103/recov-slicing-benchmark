import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addToQueue(long delay, int value) {
        /* write */ queue.put(new DelayedElement(delay, value));
    }

    public DelayQueue<DelayedElement> getQueue() {
        return queue;
    }
}
