import java.util.concurrent.BlockingQueue;

public class ReportGenerator {
    private BlockingQueue<Integer> queue;

    public ReportGenerator(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void generateReport() throws InterruptedException {
        /* read */ int data = queue.take();
        System.out.println("Report Data: " + data);
    }
}
