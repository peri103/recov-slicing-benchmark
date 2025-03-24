import java.util.concurrent.ConcurrentSkipListMap;

public class DataStorage {
    private ConcurrentSkipListMap<Integer, String> storageMap = new ConcurrentSkipListMap<>();

    public void storeData(int key, String value) {
        /* write */ storageMap.put(key, value);
    }

    public String retrieveData(int key) {
        return storageMap.get(key);
    }
}
