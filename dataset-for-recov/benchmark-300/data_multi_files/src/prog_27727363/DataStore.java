import java.util.concurrent.ConcurrentHashMap;

public class DataStore {
    private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public void storeValue(String key, int value) {
        /* write */ map.putIfAbsent(key, value);
    }

    public Integer getValue(String key) {
        return map.get(key);
    }
}
