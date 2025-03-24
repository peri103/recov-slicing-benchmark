import java.util.concurrent.LinkedTransferQueue;

public class DataWriter {
    private LinkedTransferQueue<Integer> queue;

    public DataWriter(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }
}
