import java.util.SortedMap;

public class DataProcessor {
    private DataStorage dataStorage;

    public DataProcessor(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void processData() {
        // Perform some data processing
        System.out.println("Processing data...");
    }

    public String retrieveData(int key) {
        SortedMap<Integer, String> map = dataStorage.getStorageMap();
        /* read */ String value = map.get(key);
        return value;
    }
}
