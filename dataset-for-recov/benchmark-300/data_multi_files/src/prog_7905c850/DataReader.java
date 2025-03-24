import java.util.concurrent.SynchronousQueue;

public class DataReader {
    private SynchronousQueue<Integer> queue;

    public DataReader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() {
        try {
            /* read */ return queue.take(); // Read the data from the queue
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1; // Return -1 in case of error
        }
    }
}
