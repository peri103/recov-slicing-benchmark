import java.util.PriorityQueue;

public class PriorityQueueWrapper {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void offerValue(int value) {
        /* write */ queue.offer(value);
    }

    public int pollValue() {
        return queue.poll();
    }
}
