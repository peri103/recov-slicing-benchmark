import java.util.Deque;
import java.util.ArrayDeque;

public class DataStorage {
    private Deque<Integer> deque = new ArrayDeque<>();

    public void storeData(int value) {
        /* write */ deque.addFirst(value);
    }

    public int retrieveData() {
        return deque.getFirst();
    }
}
