import java.util.concurrent.LinkedTransferQueue;

public class DataProcessor {
    private LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();

    public void processData(int data) {
        /* write */ queue.offer(data);
    }

    public LinkedTransferQueue<Integer> getQueue() {
        return queue;
    }
}
