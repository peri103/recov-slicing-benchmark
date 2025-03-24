import java.util.concurrent.LinkedBlockingDeque;

public class DataWriter {
    private LinkedBlockingDeque<Integer> deque;

    public DataWriter(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void writeData(int value) {
        /* write */ deque.addFirst(value);
    }
}
