import java.util.concurrent.LinkedBlockingDeque;

public class DataProcessor {
    private LinkedBlockingDeque<Integer> deque;

    public DataProcessor(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void processData() {
        try {
            /* read */ int value = deque.takeFirst();
            System.out.println("Processed value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
