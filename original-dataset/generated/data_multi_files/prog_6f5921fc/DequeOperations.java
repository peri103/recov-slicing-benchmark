import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeOperations {
    private BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addToDeque(int value) {
        /* write */ deque.addLast(value);
    }

    public int takeFromDeque() throws InterruptedException {
        return deque.takeLast();
    }
}
