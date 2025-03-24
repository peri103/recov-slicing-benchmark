import java.util.concurrent.SynchronousQueue;

public class DataConsumer {
    private SynchronousQueue<Integer> queue;

    public DataConsumer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int consumeData() throws InterruptedException {
        /* read */ return queue.take();
    }
}
