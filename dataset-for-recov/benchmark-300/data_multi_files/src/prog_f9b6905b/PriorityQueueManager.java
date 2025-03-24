import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueManager {
    private PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

    public void addToQueue(int value) {
        /* write */ queue.offer(value);
    }

    public Integer pollFromQueue() {
        return queue.poll();
    }
}
