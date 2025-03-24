import java.util.concurrent.ConcurrentSkipListMap;

public class DataManager {
    private ConcurrentSkipListMap<Integer, String> dataMap = new ConcurrentSkipListMap<>();

    public void addData(int key, String value) {
        /* write */ dataMap.put(key, value);
    }

    public String getData(int key) {
        return dataMap.get(key);
    }
}
