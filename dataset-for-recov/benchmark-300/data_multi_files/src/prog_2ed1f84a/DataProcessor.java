import java.util.concurrent.ConcurrentLinkedQueue;

public class DataProcessor {
    private ConcurrentLinkedQueue<Integer> dataQueue = new ConcurrentLinkedQueue<>();

    public void processData(int data) {
        /* write */ dataQueue.offer(data);
    }

    public ConcurrentLinkedQueue<Integer> getDataQueue() {
        return dataQueue;
    }
}
