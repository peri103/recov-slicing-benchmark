import java.util.concurrent.ConcurrentSkipListMap;

public class DataProcessor {
    private ConcurrentSkipListMap<String, Integer> dataMap = new ConcurrentSkipListMap<>();

    public void addData(String key, int value) {
        /* write */ dataMap.put(key, value);
    }

    public Integer getData(String key) {
        return dataMap.get(key);
    }
}
