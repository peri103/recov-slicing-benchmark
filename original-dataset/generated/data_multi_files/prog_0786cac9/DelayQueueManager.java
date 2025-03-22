import java.util.concurrent.DelayQueue;

public class DelayQueueManager {
    private DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();

    public void addElement(DelayedElement element) {
        /* write */ delayQueue.put(element);
    }

    public DelayedElement retrieveElement() throws InterruptedException {
        return delayQueue.take();
    }
}