import java.util.concurrent.LinkedBlockingQueue;

public class QueueHandler {
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void addValue(int value) {
        try {
            /* write */ queue.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int retrieveValue() {
        try {
            return /* read */ queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
