import java.util.concurrent.LinkedTransferQueue;

public class DataProducer {
    private LinkedTransferQueue<Integer> queue;

    public DataProducer(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void produceData() {
        /* write */ queue.offer(42);
    }
}
