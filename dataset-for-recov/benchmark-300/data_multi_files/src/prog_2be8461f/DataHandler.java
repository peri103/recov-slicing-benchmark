import java.util.Deque;
import java.util.ArrayDeque;

public class DataHandler {
    private Deque<Integer> dataDeque = new ArrayDeque<>();

    public void addData(int value) {
        /* write */ dataDeque.addFirst(value);
    }

    public Deque<Integer> getDataDeque() {
        return dataDeque;
    }
}
