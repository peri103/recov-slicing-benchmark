import java.util.concurrent.LinkedTransferQueue;

public class DataProducer {
    private LinkedTransferQueue<Integer> queue;

    public DataProducer(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void produceData() throws InterruptedException {
        /* write */ queue.put(42);
        System.out.println("Data produced: 42");
    }
}
