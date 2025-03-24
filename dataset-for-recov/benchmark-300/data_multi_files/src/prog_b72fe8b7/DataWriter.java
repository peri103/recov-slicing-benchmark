import java.util.concurrent.ConcurrentLinkedDeque;

public class DataWriter {
    private ConcurrentLinkedDeque<Integer> deque;

    public DataWriter(ConcurrentLinkedDeque<Integer> deque) {
        this.deque = deque;
    }

    public void writeData(int value) {
        /* write */ deque.addFirst(value);
    }
}
