import java.util.concurrent.LinkedTransferQueue;

public class DataReader {
    private LinkedTransferQueue<Integer> queue;

    public DataReader(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() throws InterruptedException {
        /* read */ return queue.take();
    }
}
