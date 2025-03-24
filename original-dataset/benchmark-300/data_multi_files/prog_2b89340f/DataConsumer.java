import java.util.concurrent.LinkedBlockingDeque;

public class DataConsumer {
    private LinkedBlockingDeque<Integer> deque;

    public DataConsumer(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void consumeData() throws InterruptedException {
        /* read */ int value = deque.takeFirst();
        System.out.println("Data consumed from deque: " + value);
    }
}
