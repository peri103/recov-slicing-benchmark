import java.util.concurrent.PriorityBlockingQueue;

public class DataProcessor {
    private PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

    public void addData(int value) {
        /* write */ queue.offer(value);
    }

    public PriorityBlockingQueue<Integer> getQueue() {
        return queue;
    }
}
