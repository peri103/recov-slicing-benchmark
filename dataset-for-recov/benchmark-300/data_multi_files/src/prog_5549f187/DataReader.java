import java.util.concurrent.SynchronousQueue;

public class DataReader {
    private SynchronousQueue<Integer> queue;

    public DataReader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() throws InterruptedException {
        /* read */ int data = queue.take();
        System.out.println("Data " + data + " read from the queue.");
        return data;
    }
}
