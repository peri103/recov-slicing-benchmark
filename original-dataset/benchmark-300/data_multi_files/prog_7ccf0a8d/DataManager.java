import java.util.HashMap;

public class DataManager {
    private HashMap<String, Integer> dataMap = new HashMap<>();

    public void storeData(String key, int value) {
        /* write */ dataMap.put(key, value);
    }

    public HashMap<String, Integer> getDataMap() {
        return dataMap;
    }
}
