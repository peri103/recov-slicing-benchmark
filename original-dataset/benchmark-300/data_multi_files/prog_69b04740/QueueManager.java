import java.util.concurrent.LinkedTransferQueue;

public class QueueManager {
    private LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();

    public void putValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int takeValue() throws InterruptedException {
        return queue.take();
    }
}
