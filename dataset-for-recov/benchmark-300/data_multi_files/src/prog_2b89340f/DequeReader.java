import java.util.concurrent.LinkedBlockingDeque;

public class DequeReader {
    private LinkedBlockingDeque<Integer> deque;

    public DequeReader(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public int readValue() throws InterruptedException {
        /* read */ return deque.takeFirst();
    }
}
