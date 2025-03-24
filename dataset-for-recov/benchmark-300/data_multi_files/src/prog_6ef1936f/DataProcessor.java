public class DataProcessor {
    private DataStorage storage;

    public DataProcessor(DataStorage storage) {
        this.storage = storage;
    }

    public void processData(String data) {
        storage.addData(data);
    }

    public boolean checkData(String data) {
        return storage.containsData(data);
    }
}
