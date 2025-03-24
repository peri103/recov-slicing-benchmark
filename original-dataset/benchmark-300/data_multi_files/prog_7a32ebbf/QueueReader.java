import java.util.concurrent.BlockingQueue;

public class QueueReader {
    private BlockingQueue<Integer> queue;

    public QueueReader(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readValue() throws InterruptedException {
        /* read */ int value = queue.take();
        System.out.println("Value " + value + " has been read from the queue.");
        return value;
    }
}
