import java.util.concurrent.BlockingQueue;

public class DataReader {
    private BlockingQueue<Integer> queue;

    public DataReader(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() throws InterruptedException {
        /* read */ int data = queue.take();
        System.out.println("Data " + data + " read from the queue.");
        return data;
    }
}
