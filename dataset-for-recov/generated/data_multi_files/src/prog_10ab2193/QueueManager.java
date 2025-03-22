import java.util.concurrent.LinkedTransferQueue;

public class QueueManager {
    private LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();

    public void offerToQueue(int value) {
        /* write */ queue.offer(value);
    }

    public LinkedTransferQueue<Integer> getQueue() {
        return queue;
    }
}
