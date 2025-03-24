import java.util.HashMap;

public class DataManager {
    private HashMap<String, Integer> dataMap = new HashMap<>();

    public void storeData(String key, int value) {
        /* write */ dataMap.put(key, value);
    }

    public Integer retrieveData(String key) {
        return dataMap.get(key);
    }
}
