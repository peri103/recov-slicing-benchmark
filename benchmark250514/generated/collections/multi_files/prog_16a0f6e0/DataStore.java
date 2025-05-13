import org.apache.commons.collections4.map.Flat3Map;

public class DataStore {
    private Flat3Map<String, Integer> map = new Flat3Map<>();

    public void storeValue(String key, int value) {
        /* write */ map.put(key, value);
    }

    public int retrieveValue(String key) {
        return map.get(key);
    }
}
