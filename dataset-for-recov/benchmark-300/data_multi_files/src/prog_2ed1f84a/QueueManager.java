import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueManager {
    private ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

    public void addToQueue(int value) {
        /* write */ queue.offer(value);
    }

    public ConcurrentLinkedQueue<Integer> getQueue() {
        return queue;
    }
}
