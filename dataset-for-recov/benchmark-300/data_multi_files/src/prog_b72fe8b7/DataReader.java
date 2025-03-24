import java.util.concurrent.ConcurrentLinkedDeque;

public class DataReader {
    private ConcurrentLinkedDeque<Integer> deque;

    public DataReader(ConcurrentLinkedDeque<Integer> deque) {
        this.deque = deque;
    }

    public Integer readData() {
        /* read */ return deque.peekFirst();
    }
}
