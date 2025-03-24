import java.util.concurrent.ConcurrentHashMap;

public class DataStore {
    private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public void storeData(String key, int value) {
        /* write */ map.put(key, value);
    }

    public Integer retrieveData(String key) {
        return map.get(key);
    }
}
