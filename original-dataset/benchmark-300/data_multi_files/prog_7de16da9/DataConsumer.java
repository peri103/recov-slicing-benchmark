import java.util.concurrent.LinkedTransferQueue;

public class DataConsumer {
    private LinkedTransferQueue<Integer> queue;

    public DataConsumer(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public int consumeData() throws InterruptedException {
        /* read */ int value = queue.take();
        return value;
    }
}
