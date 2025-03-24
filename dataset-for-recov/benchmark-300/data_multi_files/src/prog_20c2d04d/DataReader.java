import java.util.concurrent.SynchronousQueue;

public class DataReader {
    private SynchronousQueue<Integer> queue;

    public DataReader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() {
        try {
            /* read */ int data = queue.take();
            System.out.println("Data read: " + data);
            return data;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
