import java.util.concurrent.BlockingQueue;

public class DataConsumer {
    private BlockingQueue<Integer> queue;

    public DataConsumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void consumeData() throws InterruptedException {
        /* read */ int value = queue.take();
        System.out.println("Consumed value: " + value);
    }
}
