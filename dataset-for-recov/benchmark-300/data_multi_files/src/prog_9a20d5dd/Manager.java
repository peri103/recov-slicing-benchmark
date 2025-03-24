public class Manager {
    private DataProcessor processor;

    public Manager(DataProcessor processor) {
        this.processor = processor;
    }

    public void manage() throws InterruptedException {
        int data = processor.processData();
        System.out.println("Processed data: " + data);
    }
}
