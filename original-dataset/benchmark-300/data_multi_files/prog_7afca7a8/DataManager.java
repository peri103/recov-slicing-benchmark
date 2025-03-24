import java.util.concurrent.ConcurrentHashMap;

public class DataManager {
    private ConcurrentHashMap<String, Integer> dataMap = new ConcurrentHashMap<>();

    public void storeData(String key, int value) {
        /* write */ dataMap.put(key, value);
    }

    public int retrieveData(String key) {
        return dataMap.get(key);
    }
}
