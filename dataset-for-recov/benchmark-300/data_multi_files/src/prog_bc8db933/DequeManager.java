import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeManager {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addToDeque(int value) {
        /* write */ deque.addLast(value);
    }

    public Integer peekLastFromDeque() {
        return deque.peekLast();
    }
}
