import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueManager {
    private ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

    public void add(String value) {
        queue.add(value);
    }

    public ConcurrentLinkedQueue<String> getQueue() {
        return queue;
    }
}
