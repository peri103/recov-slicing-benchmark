import java.util.Deque;
import java.util.LinkedList;

public class DequeManager {
    private Deque<Integer> deque = new LinkedList<>();

    public void addFirst(int value) {
        /* write */ deque.addFirst(value);
    }

    public int getFirst() {
        return deque.getFirst();
    }
}
