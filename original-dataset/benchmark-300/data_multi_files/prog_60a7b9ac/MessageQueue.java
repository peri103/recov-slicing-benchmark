import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class MessageQueue {
    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void sendMessage(int message) throws InterruptedException {
        /* write */ queue.put(message);
    }

    public int receiveMessage() throws InterruptedException {
        return queue.take();
    }
}
