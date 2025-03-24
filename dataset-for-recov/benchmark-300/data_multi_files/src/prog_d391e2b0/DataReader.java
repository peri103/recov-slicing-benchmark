import java.util.concurrent.SynchronousQueue;

public class DataReader {
    private SynchronousQueue<Integer> queue;

    public DataReader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() {
        try {
            /* read */ int data = queue.take();
            System.out.println("Data " + data + " has been read from the queue.");
            return data;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1; // Return -1 in case of interruption
        }
    }
}
