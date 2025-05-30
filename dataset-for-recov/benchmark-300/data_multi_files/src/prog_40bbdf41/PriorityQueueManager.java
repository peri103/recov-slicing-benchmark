import java.util.PriorityQueue;

public class PriorityQueueManager {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addValue(int value) {
        /* write */ queue.offer(value);
    }

    public Integer getValue() {
        return queue.poll();
    }
}
