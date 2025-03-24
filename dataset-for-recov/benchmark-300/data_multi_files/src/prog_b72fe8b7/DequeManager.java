import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeManager {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addFirst(int value) {
        /* write */ deque.addFirst(value);
    }

    public Integer peekFirst() {
        return deque.peekFirst();
    }
}
