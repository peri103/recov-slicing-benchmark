import java.util.concurrent.PriorityBlockingQueue;

public class DataQueue {
    private PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

    public void addData(int data) {
        /* write */ queue.offer(data);
    }

    public Integer getData() {
        return queue.poll();
    }
}
