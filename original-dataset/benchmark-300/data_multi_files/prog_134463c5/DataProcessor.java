import java.util.Deque;
import java.util.LinkedList;

public class DataProcessor {
    private Deque<Integer> dataQueue = new LinkedList<>();

    public void addData(int value) {
        /* write */ dataQueue.addLast(value);
    }

    public Deque<Integer> getDataQueue() {
        return dataQueue;
    }
}
