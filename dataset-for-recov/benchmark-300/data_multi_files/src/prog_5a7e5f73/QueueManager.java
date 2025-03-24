import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addElement(DelayedElement element) {
        /* write */ queue.put(element);
    }

    public DelayQueue<DelayedElement> getQueue() {
        return queue;
    }
}
