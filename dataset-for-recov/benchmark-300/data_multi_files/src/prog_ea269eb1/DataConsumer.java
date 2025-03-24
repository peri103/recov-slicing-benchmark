import java.util.concurrent.BlockingQueue;

public class DataConsumer {
    private BlockingQueue<Integer> queue;

    public DataConsumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int consumeData() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
