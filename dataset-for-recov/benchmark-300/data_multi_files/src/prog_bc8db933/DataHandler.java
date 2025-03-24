import java.util.concurrent.ConcurrentLinkedDeque;

public class DataHandler {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addData(int data) {
        /* write */ deque.addLast(data);
    }

    public Integer getLastData() {
        return deque.peekLast();
    }
}
