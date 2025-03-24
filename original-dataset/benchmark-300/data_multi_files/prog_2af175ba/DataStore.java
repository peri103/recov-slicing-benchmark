import java.util.SortedMap;
import java.util.TreeMap;

public class DataStore {
    private SortedMap<String, Integer> map = new TreeMap<>();

    public void storeData(String key, int value) {
        /* write */ map.put(key, value);
    }

    public SortedMap<String, Integer> getMap() {
        return map;
    }
}
