import java.util.concurrent.SynchronousQueue;

public class MessageQueue {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void putMessage(int message) throws InterruptedException {
        /* write */ queue.put(message);
    }

    public int takeMessage() throws InterruptedException {
        /* read */ return queue.take();
    }
}
