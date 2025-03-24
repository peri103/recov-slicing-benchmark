import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataWriter {
    private BlockingQueue<Integer> queue;

    public DataWriter(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData(int data) throws InterruptedException {
        /* write */ queue.put(data);
    }
}
