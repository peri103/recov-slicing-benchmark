import java.util.PriorityQueue;

public class QueueManager {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addValue(int value) {
        /* write */ queue.offer(value);
    }

    public int getValue() {
        return queue.poll();
    }
}
