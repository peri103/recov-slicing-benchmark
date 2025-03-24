import java.util.concurrent.LinkedBlockingDeque;

public class DataCollector {
    private LinkedBlockingDeque<Integer> deque;

    public DataCollector(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void collectData(int value) {
        /* write */ deque.addFirst(value);
    }
}
