import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addElement(long delayTime) {
        DelayedElement element = new DelayedElement(delayTime);
        /* write */ queue.put(element);
    }

    public DelayQueue<DelayedElement> getQueue() {
        return queue;
    }
}
