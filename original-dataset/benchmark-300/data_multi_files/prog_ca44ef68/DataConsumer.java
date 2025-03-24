import java.util.concurrent.SynchronousQueue;

public class DataConsumer {
    private SynchronousQueue<Integer> queue;

    public DataConsumer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public int consumeData() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
