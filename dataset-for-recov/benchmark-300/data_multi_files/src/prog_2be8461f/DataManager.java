import java.util.Deque;
import java.util.ArrayDeque;

public class DataManager {
    private Deque<Integer> dataQueue = new ArrayDeque<>();

    public void addData(int value) {
        /* write */ dataQueue.addFirst(value);
    }

    public int getData() {
        return dataQueue.getFirst();
    }
}
