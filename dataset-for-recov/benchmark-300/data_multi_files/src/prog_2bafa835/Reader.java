import java.util.concurrent.SynchronousQueue;

public class Reader {
    private SynchronousQueue<Integer> queue;

    public Reader(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void readValue() {
        try {
            /* read */ int value = queue.take();
            System.out.println("Value read from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
