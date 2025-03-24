import java.util.Deque;
import java.util.ArrayDeque;

public class DequeOperations {
    private Deque<Integer> deque = new ArrayDeque<>();

    public void addToDeque(int value) {
        /* write */ deque.addLast(value);
    }

    public Deque<Integer> getDeque() {
        return deque;
    }
}
