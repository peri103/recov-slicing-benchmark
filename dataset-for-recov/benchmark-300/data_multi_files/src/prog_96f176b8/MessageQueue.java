import java.util.concurrent.LinkedBlockingQueue;

public class MessageQueue {
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void sendMessage(int message) throws InterruptedException {
        /* write */ queue.put(message);
    }

    public int receiveMessage() throws InterruptedException {
        return queue.take();
    }
}
