import java.util.concurrent.PriorityBlockingQueue;

public class DataReader {
    private PriorityBlockingQueue<Integer> queue;

    public DataReader(PriorityBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readData() {
        /* read */ return queue.poll();
    }
}
