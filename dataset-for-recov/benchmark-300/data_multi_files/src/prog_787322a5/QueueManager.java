import java.util.concurrent.DelayQueue;

public class QueueManager {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addElement(int delayInMillis) {
        /* write */ queue.put(new DelayedElement(delayInMillis));
    }

    public int takeElement() throws InterruptedException {
        /* read */ DelayedElement element = queue.take();
        return element.getValue();
    }
}
