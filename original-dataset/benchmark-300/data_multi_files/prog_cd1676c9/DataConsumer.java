import java.util.concurrent.LinkedBlockingDeque;

public class DataConsumer {
    private LinkedBlockingDeque<Integer> deque;

    public DataConsumer(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void consumeData() {
        try {
            /* read */ int value = deque.takeFirst();
            System.out.println("Consumed value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
