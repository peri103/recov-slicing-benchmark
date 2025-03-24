import java.util.concurrent.LinkedBlockingDeque;

public class DequeManager {
    private LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addFirst(int value) {
        /* write */ deque.addFirst(value);
    }

    public int takeFirst() throws InterruptedException {
        return deque.takeFirst();
    }
}
