import java.util.concurrent.LinkedBlockingQueue;

public class DataReader {
    private LinkedBlockingQueue<Integer> queue;

    public DataReader(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() throws InterruptedException {
        /* read */ int value = queue.take();
        System.out.println("Value " + value + " has been read from the queue.");
        return value;
    }
}
