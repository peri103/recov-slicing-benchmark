import java.util.concurrent.SynchronousQueue;

public class DataConsumer {
    private SynchronousQueue<Integer> queue;

    public DataConsumer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void consumeData() {
        try {
            Thread.sleep(1000); // Simulate some delay
            /* read */ int value = queue.take();
            System.out.println("Data consumed from the queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
