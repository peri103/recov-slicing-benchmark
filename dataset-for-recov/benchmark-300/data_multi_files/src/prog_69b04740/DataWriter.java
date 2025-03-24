import java.util.concurrent.LinkedTransferQueue;

public class DataWriter {
    private LinkedTransferQueue<Integer> queue;

    public DataWriter(LinkedTransferQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData() throws InterruptedException {
        /* write */ queue.put(1);
        System.out.println("Data written to queue");
    }
}
