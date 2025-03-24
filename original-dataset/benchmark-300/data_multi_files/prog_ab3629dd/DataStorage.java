import java.util.HashMap;

public class DataStorage {
    private HashMap<String, Integer> storage = new HashMap<>();

    public void storeData(String key, int value) {
        /* write */ storage.put(key, value);
    }

    public int retrieveData(String key) {
        return storage.get(key);
    }
}
