import java.util.concurrent.BlockingQueue;

public class DataWriter {
    private BlockingQueue<Integer> queue;

    public DataWriter(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData() {
        try {
            /* write */ queue.put(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
