import java.util.concurrent.ConcurrentSkipListMap;

public class DataManager {
    private ConcurrentSkipListMap<String, Integer> dataMap = new ConcurrentSkipListMap<>();

    public void storeData(String key, int value) {
        /* write */ dataMap.put(key, value);
    }

    public Integer retrieveData(String key) {
        return dataMap.get(key);
    }
}
