import java.util.concurrent.LinkedTransferQueue;

public class QueueManager {
    private LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();

    public void writeToQueue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readFromQueue() throws InterruptedException {
        return /* read */ queue.take();
    }
}
