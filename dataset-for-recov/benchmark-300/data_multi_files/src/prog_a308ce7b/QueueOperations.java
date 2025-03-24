import java.util.PriorityQueue;

public class QueueOperations {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addValue(int value) {
        /* write */ queue.offer(value);
    }

    public Integer getValue() {
        return queue.peek();
    }
}
