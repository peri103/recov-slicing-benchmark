import java.util.PriorityQueue;

public class DataProcessor {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addData(int data) {
        /* write */ queue.offer(data);
    }

    public PriorityQueue<Integer> getQueue() {
        return queue;
    }
}
