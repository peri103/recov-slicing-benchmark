import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addToQueue(String data, long delayInMillis) {
        /* write */ queue.put(new DelayedElement(data, delayInMillis));
    }

    public DelayQueue<DelayedElement> getQueue() {
        return queue;
    }
}
