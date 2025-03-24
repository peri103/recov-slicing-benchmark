import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeOperations {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addToDeque(int value) {
        /* write */ deque.addFirst(value);
    }

    public Integer peekFromDeque() {
        return deque.peekFirst();
    }
}
