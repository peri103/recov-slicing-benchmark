import java.util.concurrent.SynchronousQueue;

public class DataGenerator {
    private SynchronousQueue<Integer> queue;

    public DataGenerator(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void generateData() {
        try {
            /* write */ queue.put(42);
            System.out.println("Generated value: 42");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
