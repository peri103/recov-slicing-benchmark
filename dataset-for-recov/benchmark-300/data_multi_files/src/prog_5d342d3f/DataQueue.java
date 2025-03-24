import java.util.concurrent.LinkedBlockingQueue;

public class DataQueue {
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void writeData(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }

    public int readData() throws InterruptedException {
        return queue.take();
    }
}
