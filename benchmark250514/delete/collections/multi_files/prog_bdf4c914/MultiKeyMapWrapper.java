import org.apache.commons.collections4.map.MultiKeyMap;

public class MultiKeyMapWrapper<K1, K2, V> {
    private MultiKeyMap<K1, K2, V> map = new MultiKeyMap<>();

    public void putValue(K1 key1, K2 key2, V value) {
        /* write */ map.put(key1, key2, value);
    }

    public V getValue(K1 key1, K2 key2) {
        return map.get(key1, key2);
    }
}