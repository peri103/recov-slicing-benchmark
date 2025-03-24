import java.util.concurrent.LinkedTransferQueue;

public class DataConsumer {
    private LinkedTransferQueue<Integer> queue;

    public DataConsumer(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void consumeData() throws InterruptedException {
        /* read */ int value = queue.take();
        System.out.println("Consumed value: " + value);
    }
}
