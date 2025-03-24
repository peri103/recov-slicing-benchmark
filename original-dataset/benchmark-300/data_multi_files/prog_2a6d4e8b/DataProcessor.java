import java.util.concurrent.LinkedBlockingQueue;

public class DataProcessor {
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void processData(int data) {
        try {
            /* write */ queue.put(data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public LinkedBlockingQueue<Integer> getQueue() {
        return queue;
    }
}
