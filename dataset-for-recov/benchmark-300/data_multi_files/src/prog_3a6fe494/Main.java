public class Main {
    public static void main(String[] args) {
        DataStorage storage = new DataStorage();
        DataProcessor processor = new DataProcessor(storage);

        // Storing data
        storage.storeData(100);

        // Processing data
        processor.processData();
    }
}