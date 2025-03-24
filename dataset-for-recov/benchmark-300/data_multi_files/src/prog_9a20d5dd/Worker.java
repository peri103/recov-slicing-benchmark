public class Worker {
    private String name;
    private DataProcessor processor;

    public Worker(String name, DataProcessor processor) {
        this.name = name;
        this.processor = processor;
    }

    public void performTask(int data) throws InterruptedException {
        System.out.println(name + " is adding data: " + data);
        processor.addData(data);
    }

    public int getProcessedData() throws InterruptedException {
        int data = processor.processData();
        System.out.println(name + " processed data: " + data);
        return data;
    }
}
