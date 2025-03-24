import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();
    
    public void addElement(DelayedElement element) {
        /* write */ queue.put(element);
    }
    
    public DelayedElement takeElement() throws InterruptedException {
        /* read */ return queue.take();
    }
}
