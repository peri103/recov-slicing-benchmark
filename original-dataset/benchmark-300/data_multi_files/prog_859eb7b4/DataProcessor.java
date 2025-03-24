import java.util.PriorityQueue;

public class DataProcessor {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addData(int value) {
        /* write */ queue.offer(value);
    }

    public int getData() {
        return queue.peek();
    }
}
