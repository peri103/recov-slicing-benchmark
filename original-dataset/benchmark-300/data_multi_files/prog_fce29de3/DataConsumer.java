import java.util.concurrent.BlockingQueue;

public class DataConsumer {
    private BlockingQueue<Integer> dataQueue;

    public DataConsumer(BlockingQueue<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int consumeData() throws InterruptedException {
        /* read */ return dataQueue.take();
    }
}
