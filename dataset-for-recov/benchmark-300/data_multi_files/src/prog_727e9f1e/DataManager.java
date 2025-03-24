import java.util.TreeMap;

public class DataManager {
    private TreeMap<Integer, String> dataMap = new TreeMap<>();

    public void addData(int key, String value) {
        /* write */ dataMap.put(key, value);
    }

    public String getData(int key) {
        return dataMap.get(key);
    }
}
