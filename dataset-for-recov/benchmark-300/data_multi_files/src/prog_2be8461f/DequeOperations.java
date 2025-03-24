import java.util.Deque;
import java.util.ArrayDeque;

public class DequeOperations {
    private Deque<Integer> deque = new ArrayDeque<>();

    public void addFirst(int value) {
        /* write */ deque.addFirst(value);
    }

    public int getFirst() {
        return deque.getFirst();
    }

    public Deque<Integer> getDeque() {
        return deque;
    }
}
