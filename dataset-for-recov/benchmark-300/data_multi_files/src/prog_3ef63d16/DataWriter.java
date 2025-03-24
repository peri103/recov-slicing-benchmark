import java.util.concurrent.SynchronousQueue;

public class DataWriter {
    private SynchronousQueue<Integer> queue;

    public DataWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData() {
        try {
            /* write */ queue.put(42);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
