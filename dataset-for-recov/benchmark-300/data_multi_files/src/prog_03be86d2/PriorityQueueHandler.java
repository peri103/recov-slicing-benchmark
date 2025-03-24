import java.util.PriorityQueue;

public class PriorityQueueHandler {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addToQueue(int value) {
        /* write */ queue.offer(value);
    }

    public int removeFromQueue() {
        return queue.poll();
    }
}
