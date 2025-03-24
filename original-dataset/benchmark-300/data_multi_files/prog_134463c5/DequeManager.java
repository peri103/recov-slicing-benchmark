import java.util.Deque;
import java.util.LinkedList;

public class DequeManager {
    private Deque<Integer> deque = new LinkedList<>();

    public void addToDeque(int value) {
        /* write */ deque.addLast(value);
    }

    public Deque<Integer> getDeque() {
        return deque;
    }
}
