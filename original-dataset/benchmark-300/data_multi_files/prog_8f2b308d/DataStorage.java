import java.util.concurrent.ConcurrentSkipListMap;

public class DataStorage {
    private ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

    public void storeData(int key, String value) {
        /* write */ map.put(key, value);
    }

    public String retrieveData(int key) {
        return map.get(key);
    }
}
