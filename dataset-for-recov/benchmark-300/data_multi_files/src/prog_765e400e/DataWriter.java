import java.util.concurrent.ConcurrentLinkedQueue;

public class DataWriter {
    private ConcurrentLinkedQueue<Integer> queue;

    public DataWriter(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData(int value) {
        /* write */ queue.offer(value);
    }
}
