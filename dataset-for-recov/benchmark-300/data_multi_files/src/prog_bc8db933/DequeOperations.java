import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeOperations {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addToDeque(int value) {
        /* write */ deque.addLast(value);
    }

    public Integer getLastElement() {
        return deque.peekLast();
    }
}
