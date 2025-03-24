import java.util.concurrent.ConcurrentLinkedDeque;

public class DataProcessor {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addData(int data) {
        /* write */ deque.addFirst(data);
    }

    public Integer getFirstData() {
        return deque.peekFirst();
    }

    public void processData() {
        for (Integer num : deque) {
            System.out.println("Processing: " + num);
        }
    }
}
