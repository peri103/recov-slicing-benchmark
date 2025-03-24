import java.util.PriorityQueue;

public class PriorityQueueManager {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addToQueue(int value) {
        /* write */ queue.offer(value);
    }

    public Integer peekQueue() {
        return queue.peek();
    }

    public PriorityQueue<Integer> getQueue() {
        return queue;
    }
}
