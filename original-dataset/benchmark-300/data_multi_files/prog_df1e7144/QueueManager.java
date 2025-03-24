import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue;

    public QueueManager() {
        this.queue = new DelayQueue<>();
    }

    public void addElement(long delay) {
        /* write */ queue.put(new DelayedElement(delay));
    }

    public DelayedElement takeElement() throws InterruptedException {
        /* read */ return queue.take();
    }
}
