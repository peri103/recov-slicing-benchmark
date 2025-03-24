import java.util.concurrent.LinkedBlockingDeque;

public class DequeManager {
    private LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addValue(int value) {
        /* write */ deque.addLast(value);
    }

    public int getValue() throws InterruptedException {
        return deque.takeLast();
    }
}
