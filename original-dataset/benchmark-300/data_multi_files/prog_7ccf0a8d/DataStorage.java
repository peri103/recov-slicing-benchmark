import java.util.HashMap;

public class DataStorage {
    private HashMap<String, Integer> storage = new HashMap<>();

    public void storeData(String key, int value) {
        /* write */ storage.put(key, value);
    }

    public HashMap<String, Integer> getStorage() {
        return storage;
    }
}
