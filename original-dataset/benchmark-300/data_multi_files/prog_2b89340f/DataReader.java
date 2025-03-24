import java.util.concurrent.LinkedBlockingDeque;

public class DataReader {
    private LinkedBlockingDeque<Integer> deque;

    public DataReader(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public int readData() throws InterruptedException {
        /* read */ return deque.takeFirst();
    }
}
