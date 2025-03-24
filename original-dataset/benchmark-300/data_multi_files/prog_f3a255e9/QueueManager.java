import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addElement(long delay, String data) {
        /* write */ queue.put(new DelayedElement(delay, data));
    }

    public DelayQueue<DelayedElement> getQueue() {
        return queue;
    }
}
