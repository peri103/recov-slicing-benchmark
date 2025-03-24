import java.util.concurrent.LinkedBlockingDeque;

public class DataProducer {
    private LinkedBlockingDeque<Integer> deque;

    public DataProducer(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public void produceData() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            deque.addLast(i * 10);
            Thread.sleep(100);
        }
    }
}
