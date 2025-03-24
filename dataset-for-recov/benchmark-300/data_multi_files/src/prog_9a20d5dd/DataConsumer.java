import java.util.concurrent.BlockingDeque;

public class DataConsumer {
    private BlockingDeque<Integer> deque;

    public DataConsumer(BlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public int consumeData() throws InterruptedException {
        /* read */ int data = deque.takeFirst();
        System.out.println("Data " + data + " consumed from the deque.");
        return data;
    }
}
