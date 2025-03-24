import java.util.concurrent.LinkedTransferQueue;

public class DataProcessor {
    private LinkedTransferQueue<Integer> queue;

    public DataProcessor(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void processData() throws InterruptedException {
        /* read */ int value = queue.take();
        System.out.println("Processed value: " + value);
    }
}
