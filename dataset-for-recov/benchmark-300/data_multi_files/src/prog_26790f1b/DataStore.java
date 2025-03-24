import java.util.TreeMap;

public class DataStore {
    private TreeMap<String, Integer> map = new TreeMap<>();

    public void storeValue(String key, int value) {
        /* write */ map.put(key, value);
    }

    public Integer retrieveValue(String key) {
        return map.get(key);
    }
}
