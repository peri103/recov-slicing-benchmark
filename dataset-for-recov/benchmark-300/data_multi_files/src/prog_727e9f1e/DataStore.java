import java.util.TreeMap;

public class DataStore {
    private TreeMap<Integer, String> map = new TreeMap<>();

    public void storeData(int key, String value) {
        /* write */ map.put(key, value);
    }

    public String retrieveData(int key) {
        return map.get(key);
    }
}
