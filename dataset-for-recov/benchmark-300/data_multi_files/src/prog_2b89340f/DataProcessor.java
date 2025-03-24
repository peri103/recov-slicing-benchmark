import java.util.concurrent.LinkedBlockingDeque;

public class DataProcessor {
    private LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addData(int data) {
        /* write */ deque.addFirst(data);
        System.out.println("Data " + data + " added to the deque.");
    }

    public int processData() throws InterruptedException {
        /* read */ int data = deque.takeFirst();
        System.out.println("Data " + data + " processed from the deque.");
        return data;
    }
}
