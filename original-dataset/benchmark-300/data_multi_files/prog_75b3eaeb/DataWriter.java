import java.util.concurrent.SynchronousQueue;

public class DataWriter {
    private SynchronousQueue<Integer> queue;

    public DataWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }
}
