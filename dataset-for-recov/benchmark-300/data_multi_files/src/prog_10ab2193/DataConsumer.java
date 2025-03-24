import java.util.concurrent.LinkedTransferQueue;

public class DataConsumer {
    private LinkedTransferQueue<Integer> queue;

    public DataConsumer(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void consumeData() {
        /* read */ Integer value = queue.poll();
        System.out.println("Consumed value: " + value);
    }
}
