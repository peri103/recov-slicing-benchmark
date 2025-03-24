import java.util.SortedMap;
import java.util.TreeMap;

public class DataStorage {
    private SortedMap<String, Integer> storage = new TreeMap<>();

    public void storeData(String key, int value) {
        /* write */ storage.put(key, value);
    }

    public Integer retrieveData(String key) {
        return storage.get(key);
    }
}
