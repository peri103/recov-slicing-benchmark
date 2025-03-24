import java.util.concurrent.BlockingQueue;

public class DataConsumer {
    private BlockingQueue<Integer> queue;

    public DataConsumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int consumeData() throws InterruptedException {
        /* read */ int data = queue.take();
        return data;
    }
}
