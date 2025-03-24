import java.util.concurrent.CopyOnWriteArrayList;

public class DataProcessor {
    private DataStorage dataStorage;

    public DataProcessor(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void processData() {
        CopyOnWriteArrayList<String> storage = dataStorage.getStorage();
        /* read */ String data = storage.get(0);
        System.out.println("Processed Data: " + data);
    }
}
