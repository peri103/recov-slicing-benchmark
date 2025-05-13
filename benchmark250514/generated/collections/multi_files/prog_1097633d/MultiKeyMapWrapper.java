import org.apache.commons.collections4.map.MultiKeyMap;

public class MultiKeyMapWrapper {
    private MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();

    public void putValue(String key1, String key2, int value) {
        /* write */ multiKeyMap.put(key1, key2, value);
    }

    public Integer getValue(String key1, String key2) {
        return multiKeyMap.get(key1, key2);
    }
}