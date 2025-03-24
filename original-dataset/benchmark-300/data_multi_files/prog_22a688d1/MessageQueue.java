import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MessageQueue {
    private BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

    public void sendMessage(String message) throws InterruptedException {
        /* write */ queue.put(message);
    }

    public String receiveMessage() throws InterruptedException {
        return queue.take();
    }
}
