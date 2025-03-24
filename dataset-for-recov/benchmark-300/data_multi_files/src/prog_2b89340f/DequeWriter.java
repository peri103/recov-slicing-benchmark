import java.util.concurrent.LinkedBlockingDeque;

public class DequeWriter {
    private LinkedBlockingDeque<Integer> deque;

    public DequeWriter(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void writeValue(int value) {
        /* write */ deque.addFirst(value);
    }
}
