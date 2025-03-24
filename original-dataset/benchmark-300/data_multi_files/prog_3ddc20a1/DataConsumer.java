import java.util.concurrent.LinkedBlockingDeque;

public class DataConsumer {
    private LinkedBlockingDeque<Integer> deque;

    public DataConsumer(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void consumeData() {
        try {
            /* read */ int value = deque.takeLast();
            System.out.println("Data consumed from deque: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
