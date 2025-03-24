import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker {
    private String name;
    private DataProcessor dataProcessor;

    public Worker(String name, DataProcessor dataProcessor) {
        this.name = name;
        this.dataProcessor = dataProcessor;
    }

    public void processData(int data) {
        dataProcessor.addData(data);
    }

    public ConcurrentLinkedQueue<Integer> getProcessedData() {
        return dataProcessor.getDataQueue();
    }
}
