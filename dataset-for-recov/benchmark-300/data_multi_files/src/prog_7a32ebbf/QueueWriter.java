import java.util.concurrent.BlockingQueue;

public class QueueWriter {
    private BlockingQueue<Integer> queue;

    public QueueWriter(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
        System.out.println("Value " + value + " has been written to the queue.");
    }
}
