import java.util.PriorityQueue;

public class PriorityQueueManager {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addElement(int element) {
        /* write */ queue.offer(element);
    }

    public PriorityQueue<Integer> getQueue() {
        return queue;
    }
}
