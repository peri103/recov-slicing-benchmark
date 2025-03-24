import java.util.concurrent.LinkedTransferQueue;

public class DataConsumer {
    private LinkedTransferQueue<Integer> queue;

    public DataConsumer(LinkedTransferQueue<Integer> queue) {
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
