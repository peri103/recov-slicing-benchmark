import java.util.concurrent.BlockingDeque;

public class DataWriter {
    private BlockingDeque<Integer> deque;

    public DataWriter(BlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void writeData() throws InterruptedException {
        /* write */ deque.addFirst(42);
        System.out.println("Value 42 written to the deque.");
    }
}
