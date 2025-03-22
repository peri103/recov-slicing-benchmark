import java.util.concurrent.DelayQueue;

public class DelayQueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addElement(DelayedElement element) {
        /* write */ queue.put(element);
    }

    public DelayedElement retrieveElement() throws InterruptedException {
        /* read */ return queue.take();
    }
}
