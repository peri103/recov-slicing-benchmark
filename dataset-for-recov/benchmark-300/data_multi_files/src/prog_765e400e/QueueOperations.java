import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueOperations {
    private ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

    public void addToQueue(int value) {
        /* write */ queue.offer(value);
    }

    public Integer pollFromQueue() {
        return queue.poll();
    }
}
