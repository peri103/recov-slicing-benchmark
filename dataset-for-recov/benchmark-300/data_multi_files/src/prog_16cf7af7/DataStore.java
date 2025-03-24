import java.util.concurrent.ConcurrentHashMap;

public class DataStore {
    private ConcurrentHashMap<String, Integer> store = new ConcurrentHashMap<>();

    public void putData(String key, int value) {
        /* write */ store.put(key, value);
    }

    public Integer getData(String key) {
        return store.get(key);
    }
}
