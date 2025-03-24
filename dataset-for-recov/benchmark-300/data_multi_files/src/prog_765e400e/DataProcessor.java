import java.util.concurrent.ConcurrentLinkedQueue;

public class DataProcessor {
    private ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

    public void addData(int data) {
        /* write */ queue.offer(data);
    }

    public Integer getData() {
        return queue.poll();
    }
}
