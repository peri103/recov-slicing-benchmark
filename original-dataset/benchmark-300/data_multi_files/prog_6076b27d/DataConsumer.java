import java.util.concurrent.LinkedBlockingQueue;

public class DataConsumer {
    private LinkedBlockingQueue<Integer> queue;

    public DataConsumer(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int consumeData() throws InterruptedException {
        /* read */ return queue.take();
    }
}
