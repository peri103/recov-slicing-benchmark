import java.util.concurrent.SynchronousQueue;

public class DataWriter {
    private SynchronousQueue<Integer> queue;

    public DataWriter(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData(int data) {
        try {
            /* write */ queue.put(data); // Write the data to the queue
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
