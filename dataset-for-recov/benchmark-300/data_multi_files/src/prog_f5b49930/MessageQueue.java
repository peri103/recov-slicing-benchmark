import java.util.concurrent.ConcurrentLinkedDeque;

public class MessageQueue {
    private ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();

    public void addMessage(String message) {
        /* write */ deque.addFirst(message);
    }

    public String getFirstMessage() {
        return deque.peekFirst();
    }
}
