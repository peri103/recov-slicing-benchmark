import java.util.Deque;
import java.util.ArrayDeque;

public class DataWriter {
    private Deque<Integer> deque;

    public DataWriter(Deque<Integer> deque) {
        this.deque = deque;
    }

    public void writeData(int value) {
        /* write */ deque.addLast(value);
    }
}
