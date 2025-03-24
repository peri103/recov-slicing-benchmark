import java.util.concurrent.PriorityBlockingQueue;

public class DataWriter {
    private PriorityBlockingQueue<Integer> queue;

    public DataWriter(PriorityBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData(int value) {
        /* write */ queue.offer(value);
    }
}
