import java.util.concurrent.BlockingDeque;

public class DataProducer {
    private BlockingDeque<Integer> deque;

    public DataProducer(BlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void produceData() throws InterruptedException {
        /* write */ deque.addFirst(42);
    }
}
