import java.util.concurrent.LinkedTransferQueue;

public class DataProcessor {
    private LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();

    public void addData(int data) {
        /* write */ queue.put(data);
    }

    public int getData() throws InterruptedException {
        return queue.take();
    }
}
