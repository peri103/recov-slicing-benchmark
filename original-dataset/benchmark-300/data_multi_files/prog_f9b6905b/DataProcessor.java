import java.util.concurrent.PriorityBlockingQueue;

public class DataProcessor {
    private PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

    public void addData(int data) {
        /* write */ queue.offer(data);
    }

    public PriorityBlockingQueue<Integer> getQueue() {
        return queue;
    }
}
