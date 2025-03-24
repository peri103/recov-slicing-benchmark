import java.util.concurrent.ConcurrentLinkedQueue;

public class DataReader {
    private ConcurrentLinkedQueue<Integer> queue;

    public DataReader(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
    }

    public Integer readData() {
        /* read */ return queue.poll();
    }
}
