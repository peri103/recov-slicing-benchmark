import java.util.TreeMap;

public class DataManager {
    private TreeMap<String, Integer> dataMap = new TreeMap<>();

    public void storeData(String key, int value) {
        /* write */ dataMap.put(key, value);
    }

    public int retrieveData(String key) {
        return dataMap.get(key);
    }
}
