public class Worker {
    private String name;
    private DataProcessor processor;

    public Worker(String name, DataProcessor processor) {
        this.name = name;
        this.processor = processor;
    }

    public void addTask(int task) throws InterruptedException {
        processor.addData(task);
    }

    public int getResult() throws InterruptedException {
        return processor.processData();
    }
}
