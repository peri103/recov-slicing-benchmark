import java.util.concurrent.ConcurrentHashMap;

public class DataStorage {
    private ConcurrentHashMap<String, Integer> storage = new ConcurrentHashMap<>();

    public void storeData(String key, int value) {
        /* write */ storage.putIfAbsent(key, value);
    }

    public Integer retrieveData(String key) {
        return storage.get(key);
    }
}
