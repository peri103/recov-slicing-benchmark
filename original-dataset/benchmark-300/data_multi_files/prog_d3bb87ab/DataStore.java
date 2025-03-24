import java.util.concurrent.ConcurrentHashMap;

public class DataStore {
    private ConcurrentHashMap<String, Integer> store = new ConcurrentHashMap<>();

    public void putIfAbsent(String key, Integer value) {
        /* write */ store.putIfAbsent(key, value);
    }

    public Integer get(String key) {
        return store.get(key);
    }
}
