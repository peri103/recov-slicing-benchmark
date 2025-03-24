import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MessageQueue {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void sendMessage(int message) throws InterruptedException {
        /* write */ queue.put(message);
    }

    public int receiveMessage() throws InterruptedException {
        /* read */ return queue.take();
    }
}
