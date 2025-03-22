import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeOperations {
    private BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addValue(int value) {
        /* write */ deque.addLast(value);
    }

    public int retrieveLastValue() throws InterruptedException {
        return /* read */ deque.takeLast();
    }

    public BlockingDeque<Integer> getDeque() {
        return deque;
    }
}
