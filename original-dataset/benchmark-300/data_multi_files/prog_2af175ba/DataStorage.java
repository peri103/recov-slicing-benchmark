import java.util.SortedMap;
import java.util.TreeMap;

public class DataStorage {
    private SortedMap<String, Integer> storageMap = new TreeMap<>();

    public void storeData(String key, int value) {
        /* write */ storageMap.put(key, value);
    }

    public SortedMap<String, Integer> getStorageMap() {
        return storageMap;
    }
}
