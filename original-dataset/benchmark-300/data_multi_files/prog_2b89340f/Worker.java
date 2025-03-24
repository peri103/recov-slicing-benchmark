public class Worker {
    private String name;
    private DataProcessor dataProcessor;

    public Worker(String name, DataProcessor dataProcessor) {
        this.name = name;
        this.dataProcessor = dataProcessor;
    }

    public void addData(int data) {
        dataProcessor.addData(data);
    }

    public int processData() throws InterruptedException {
        return dataProcessor.processData();
    }
}
