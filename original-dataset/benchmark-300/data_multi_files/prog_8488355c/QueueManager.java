import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addElement(long delayTime) {
        /* write */ queue.put(new DelayedElement(delayTime));
    }

    public DelayQueue<DelayedElement> getQueue() {
        return queue;
    }
}
