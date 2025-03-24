import java.util.concurrent.DelayQueue;

public class MessageQueue {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void addMessage(String message, long delay) {
        /* write */ queue.put(new DelayedElement(delay, message));
    }

    public String getMessage() throws InterruptedException {
        /* read */ DelayedElement element = queue.take();
        return element.getData();
    }
}
