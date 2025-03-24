import java.util.concurrent.SynchronousQueue;

public class DataConsumer {
    private SynchronousQueue<Integer> queue;

    public DataConsumer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void consumeData() {
        try {
            /* read */ int data = queue.take();
            System.out.println("Consumed data: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
