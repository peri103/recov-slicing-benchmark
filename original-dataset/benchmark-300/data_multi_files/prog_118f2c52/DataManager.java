import java.util.Deque;
import java.util.ArrayDeque;

public class DataManager {
    private Deque<Integer> dataDeque = new ArrayDeque<>();

    public void addData(int value) {
        /* write */ dataDeque.addLast(value);
    }

    public Deque<Integer> getDataDeque() {
        return dataDeque;
    }
}
