import java.util.concurrent.ConcurrentLinkedQueue;

public class DataQueue {
    private ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

    public void enqueueData(int data) {
        /* write */ queue.offer(data);
    }

    public Integer dequeueData() {
        return queue.poll();
    }
}
