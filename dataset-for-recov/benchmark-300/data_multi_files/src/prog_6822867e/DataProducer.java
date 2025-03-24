import java.util.concurrent.BlockingQueue;

public class DataProducer {
    private BlockingQueue<Integer> queue;

    public DataProducer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void produceData() {
        try {
            /* write */ queue.put(1);
            System.out.println("Produced value: 1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
