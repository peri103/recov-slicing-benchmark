import org.apache.commons.collections4.map.ReferenceMap;

public class ReferenceMapWrapper {
    private ReferenceMap<String, Integer> map = new ReferenceMap<>();

    public void putValue(String key, Integer value) {
        /* write */ map.put(key, value);
    }

    public Integer getValue(String key) {
        return map.get(key);
    }
}
