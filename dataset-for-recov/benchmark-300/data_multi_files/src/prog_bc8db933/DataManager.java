public class DataManager {
    private DataProcessor processor = new DataProcessor();

    public void processData(int data) {
        processor.addData(data);
    }

    public Integer retrieveLastData() {
        return processor.getLastData();
    }
}
