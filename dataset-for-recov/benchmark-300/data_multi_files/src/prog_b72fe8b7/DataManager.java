import java.util.concurrent.ConcurrentLinkedDeque;

public class DataManager {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addData(int value) {
        /* write */ deque.addFirst(value);
    }

    public Integer getData() {
        return deque.peekFirst();
    }
}
