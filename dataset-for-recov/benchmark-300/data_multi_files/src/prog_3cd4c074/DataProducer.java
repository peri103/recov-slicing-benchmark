import java.util.concurrent.SynchronousQueue;

public class DataProducer {
    private SynchronousQueue<Integer> queue;

    public DataProducer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void produceData() {
        try {
            /* write */ queue.put(42);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
