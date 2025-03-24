import java.util.concurrent.LinkedBlockingQueue;

public class DataWriter {
    private LinkedBlockingQueue<Integer> queue;

    public DataWriter(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeData(int value) throws InterruptedException {
        /* write */ queue.put(value);
        System.out.println("Value " + value + " has been written to the queue.");
    }
}
