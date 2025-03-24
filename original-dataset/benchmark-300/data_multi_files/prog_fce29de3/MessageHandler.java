import java.util.concurrent.BlockingQueue;

public class MessageHandler {
    private BlockingQueue<String> queue;

    public MessageHandler(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void sendMessages() throws InterruptedException {
        String[] messages = {"Hello", "World", "Java", "Programming"};
        for (String msg : messages) {
            queue.put(msg);
        }
    }

    public void printMessages() throws InterruptedException {
        while (!queue.isEmpty()) {
            System.out.println("Message from queue: " + queue.take());
        }
    }
}
