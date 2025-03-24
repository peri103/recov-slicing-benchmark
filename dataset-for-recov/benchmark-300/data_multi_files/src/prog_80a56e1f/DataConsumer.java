import java.util.concurrent.BlockingQueue;

public class DataConsumer {
    private BlockingQueue<Integer> queue;

    public DataConsumer(BlockingQueue<Integer> queue) {
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
