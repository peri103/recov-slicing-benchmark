import java.util.concurrent.LinkedTransferQueue;

public class DataReader {
    private LinkedTransferQueue<Integer> queue;

    public DataReader(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
