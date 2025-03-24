import java.util.concurrent.ConcurrentSkipListMap;

public class DataStorage {
    private ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();

    public void storeData(String key, int value) {
        /* write */ map.put(key, value);
    }

    public Integer retrieveData(String key) {
        return map.get(key);
    }
}
