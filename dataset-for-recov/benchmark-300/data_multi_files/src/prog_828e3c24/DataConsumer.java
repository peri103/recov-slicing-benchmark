import java.util.concurrent.LinkedTransferQueue;

public class DataConsumer {
    private LinkedTransferQueue<Integer> queue;

    public DataConsumer(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void consumeData() {
        try {
            /* read */ int value = queue.take();
            System.out.println("Consumed value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
