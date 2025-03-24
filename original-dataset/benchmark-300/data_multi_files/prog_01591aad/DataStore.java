import java.util.HashMap;

public class DataStore {
    private HashMap<String, Integer> map = new HashMap<>();

    public void storeValue(String key, int value) {
        /* write */ map.put(key, value);
    }

    public Integer retrieveValue(String key) {
        return map.get(key);
    }
}
