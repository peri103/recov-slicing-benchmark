import java.util.TreeMap;

public class DataStore {
    private TreeMap<String, Integer> map = new TreeMap<>();

    public void storeData(String key, int value) {
        /* write */ map.put(key, value);
    }

    public int retrieveData(String key) {
        return map.get(key);
    }
}
