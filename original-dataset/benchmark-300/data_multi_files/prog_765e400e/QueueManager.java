import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueManager {
    private ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

    public void addValue(int value) {
        /* write */ queue.offer(value);
    }

    public Integer getValue() {
        return queue.poll();
    }
}
