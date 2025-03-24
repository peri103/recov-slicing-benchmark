import java.util.concurrent.BlockingDeque;

public class Worker {
    private DataProcessor dataProcessor;

    public Worker(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    public void processData() {
        BlockingDeque<Integer> queue = dataProcessor.getDataQueue();
        try {
            /* read */ int value = queue.takeLast();
            System.out.println("Processed value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
