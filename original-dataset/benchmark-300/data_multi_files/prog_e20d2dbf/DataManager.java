import java.util.Deque;
import java.util.LinkedList;

public class DataManager {
    private Deque<Integer> dataDeque = new LinkedList<>();

    public void addData(int value) {
        /* write */ dataDeque.addFirst(value);
    }

    public Deque<Integer> getDataDeque() {
        return dataDeque;
    }
}
