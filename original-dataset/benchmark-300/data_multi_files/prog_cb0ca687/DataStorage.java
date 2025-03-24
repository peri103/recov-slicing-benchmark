import java.util.TreeMap;

public class DataStorage {
    private TreeMap<String, Integer> storage = new TreeMap<>();

    public void storeData(String key, int value) {
        /* write */ storage.put(key, value);
    }

    public int retrieveData(String key) {
        return storage.get(key);
    }
}
