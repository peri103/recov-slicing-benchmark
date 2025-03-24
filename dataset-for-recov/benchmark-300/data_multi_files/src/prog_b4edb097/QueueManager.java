import java.util.PriorityQueue;

public class QueueManager {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addToQueue(int value) {
        /* write */ queue.offer(value);
    }

    public int peekQueue() {
        return queue.peek();
    }
}
