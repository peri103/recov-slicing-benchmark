import java.util.concurrent.BlockingDeque;

public class DataConsumer {
    private BlockingDeque<Integer> dataQueue;

    public DataConsumer(BlockingDeque<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public void consumeData() {
        try {
            /* read */ int data = dataQueue.takeLast();
            System.out.println("Consumed data: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
