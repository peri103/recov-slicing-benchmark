import java.util.concurrent.ConcurrentSkipListMap;

public class DataStore {
    private ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();

    public void writeData(String key, int value) {
        /* write */ map.put(key, value);
    }

    public int readData(String key) {
        return map.get(key);
    }
}
