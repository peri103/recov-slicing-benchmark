import java.util.concurrent.SynchronousQueue;

public class DataConsumer {
    private SynchronousQueue<Integer> queue;

    public DataConsumer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int consumeData() throws InterruptedException {
        // Read the value from the queue
        /* read */ int value = queue.take();
        return value;
    }
}
