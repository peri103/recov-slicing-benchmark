import java.util.concurrent.LinkedBlockingDeque;

public class DequeOperations {
    private LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addFirst(int value) {
        /* write */ deque.addFirst(value);
    }

    public int takeFirst() throws InterruptedException {
        return deque.takeFirst();
    }
}
