import java.util.Deque;
import java.util.LinkedList;

public class DequeOperations {
    private Deque<Integer> deque = new LinkedList<>();

    public void addToDeque(int value) {
        /* write */ deque.addFirst(value);
    }

    public Deque<Integer> getDeque() {
        return deque;
    }
}
