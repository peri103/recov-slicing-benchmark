import java.util.concurrent.LinkedTransferQueue;

public class DataProcessor {
    private LinkedTransferQueue<Integer> queue;

    public DataProcessor(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void processData(int data) {
        /* write */ queue.put(data);
    }

    public LinkedTransferQueue<Integer> getQueue() {
        return queue;
    }
}
