import java.util.concurrent.ConcurrentLinkedDeque;

public class MessageQueue {
    private ConcurrentLinkedDeque<String> queue = new ConcurrentLinkedDeque<>();

    public void addMessage(String message) {
        /* write */ queue.addFirst(message);
    }

    public String getMessage() {
        return queue.peekFirst();
    }
}
