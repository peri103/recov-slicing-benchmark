import java.util.Deque;
import java.util.LinkedList;

public class DataHolder {
    private Deque<Integer> deque = new LinkedList<>();

    public void addData(int data) {
        /* write */ deque.addFirst(data);
    }

    public Deque<Integer> getDeque() {
        return deque;
    }
}
