import org.apache.commons.collections4.map.MultiKeyMap;

public class MultiKeyValueStore {
    private MultiKeyMap<String, Integer> map = new MultiKeyMap<>();

    public void putValue(String key1, String key2, Integer value) {
        /* write */ map.put(key1, key2, value);
    }

    public Integer getValue(String key1, String key2) {
        return map.get(key1, key2);
    }
}
