import java.util.SortedMap;
import java.util.TreeMap;

public class DataManager {
    private SortedMap<String, Integer> dataMap = new TreeMap<>();

    public void addData(String key, int value) {
        /* write */ dataMap.put(key, value);
    }

    public SortedMap<String, Integer> getDataMap() {
        return dataMap;
    }
}
