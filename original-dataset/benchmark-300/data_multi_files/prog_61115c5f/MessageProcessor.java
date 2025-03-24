import java.util.concurrent.DelayQueue;

public class MessageProcessor {
    private DelayQueue<DelayedElement> queue;

    public MessageProcessor(DelayQueue<DelayedElement> queue) {
        this.queue = queue;
    }

    public void processMessages() throws InterruptedException {
        /* read */ DelayedElement element = queue.take();
        System.out.println("Processed: " + element.getData());
    }
}
