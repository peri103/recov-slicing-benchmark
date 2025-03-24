import java.util.Deque;

public class DataReader {
    private Deque<Integer> deque;

    public DataReader(Deque<Integer> deque) {
        this.deque = deque;
    }

    public int readData() {
        /* read */ return deque.getLast();
    }
}
