import java.util.concurrent.ConcurrentLinkedQueue;

public class ResultReader {
    private ConcurrentLinkedQueue<Integer> queue;

    public ResultReader(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
    }

    public void readResult() {
        // Read the value written by the write method
        /* read */ Integer value = queue.poll();
        System.out.println("Value read from queue: " + value);
    }
}
