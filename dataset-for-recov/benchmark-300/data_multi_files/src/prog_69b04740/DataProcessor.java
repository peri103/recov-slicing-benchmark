import java.util.concurrent.LinkedTransferQueue;

public class DataProcessor {
    private LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();

    public void processData(int data) throws InterruptedException {
        /* write */ queue.put(data);
    }

    public int retrieveData() throws InterruptedException {
        return queue.take();
    }
}
