import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeManager {
    private BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addValue(int value) {
        /* write */ deque.addFirst(value);
    }

    public int takeValue() throws InterruptedException {
        return deque.takeFirst();
    }
}
