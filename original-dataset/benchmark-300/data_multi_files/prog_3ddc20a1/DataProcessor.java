import java.util.concurrent.LinkedBlockingDeque;

public class DataProcessor {
    private LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void processData(int value) {
        /* write */ deque.addLast(value);
    }

    public LinkedBlockingDeque<Integer> getDeque() {
        return deque;
    }
}
