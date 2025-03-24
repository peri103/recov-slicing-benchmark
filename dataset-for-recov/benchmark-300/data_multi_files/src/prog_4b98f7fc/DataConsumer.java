import java.util.concurrent.BlockingDeque;

public class DataConsumer {
    private BlockingDeque<Integer> dataQueue;

    public DataConsumer(BlockingDeque<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public void consumeData() throws InterruptedException {
        /* read */ int value = dataQueue.takeLast();
        System.out.println("Consumed value: " + value);
    }
}
