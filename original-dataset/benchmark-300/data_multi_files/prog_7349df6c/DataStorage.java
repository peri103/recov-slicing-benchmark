import java.util.SortedMap;
import java.util.TreeMap;

public class DataStorage {
    private SortedMap<Integer, String> storage = new TreeMap<>();

    public void storeData(int key, String value) {
        /* write */ storage.put(key, value);
    }

    public String retrieveData(int key) {
        return storage.get(key);
    }
}
