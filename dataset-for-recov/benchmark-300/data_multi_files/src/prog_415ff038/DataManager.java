import java.util.concurrent.ConcurrentHashMap;

public class DataManager {
    private ConcurrentHashMap<String, Integer> dataMap = new ConcurrentHashMap<>();

    public void storeData(String key, int value) {
        /* write */ dataMap.put(key, value);
    }

    public ConcurrentHashMap<String, Integer> getDataMap() {
        return dataMap;
    }
}
