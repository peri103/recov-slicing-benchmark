import java.util.concurrent.ConcurrentSkipListMap;

public class DataStorage {
    private ConcurrentSkipListMap<String, Integer> storage = new ConcurrentSkipListMap<>();

    public void storeData(String key, int value) {
        /* write */ storage.put(key, value);
    }

    public Integer retrieveData(String key) {
        return storage.get(key);
    }
}
