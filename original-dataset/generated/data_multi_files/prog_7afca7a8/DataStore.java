import java.util.concurrent.ConcurrentHashMap;

public class DataStore {
    private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public void putValue(String key, int value) {
        /* write */ map.put(key, value);
    }

    public int getValue(String key) {
        return map.get(key);
    }
}
