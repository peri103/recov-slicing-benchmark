import java.util.concurrent.SynchronousQueue;

public class DataConsumer {
    private SynchronousQueue<Integer> queue;

    public DataConsumer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void consumeData() throws InterruptedException {
        /* read */ int value = queue.take();
        System.out.println("Consumed value: " + value);
    }
}
