import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DataProcessor {
    private BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addData(int data) {
        /* write */ deque.addFirst(data);
    }

    public int getData() throws InterruptedException {
        return deque.takeFirst();
    }
}
