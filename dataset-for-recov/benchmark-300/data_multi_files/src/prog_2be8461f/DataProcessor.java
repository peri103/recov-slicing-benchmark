import java.util.Deque;
import java.util.ArrayDeque;

public class DataProcessor {
    private Deque<Integer> deque = new ArrayDeque<>();

    public void addData(int data) {
        /* write */ deque.addFirst(data);
    }

    public int getData() {
        return deque.getFirst();
    }
}
