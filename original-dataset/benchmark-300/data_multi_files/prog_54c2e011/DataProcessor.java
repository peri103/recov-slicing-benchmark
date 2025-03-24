import java.util.concurrent.LinkedBlockingDeque;

public class DataProcessor {
    private LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addData(int data) {
        /* write */ deque.addLast(data);
    }

    public int getData() throws InterruptedException {
        return deque.takeLast();
    }
}
