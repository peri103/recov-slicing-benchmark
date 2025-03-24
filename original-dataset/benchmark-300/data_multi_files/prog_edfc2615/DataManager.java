import java.util.SortedMap;
import java.util.TreeMap;

public class DataManager {
    private SortedMap<Integer, String> dataMap = new TreeMap<>();

    public void addData(int key, String value) {
        /* write */ dataMap.put(key, value);
    }

    public SortedMap<Integer, String> getDataMap() {
        return dataMap;
    }
}
