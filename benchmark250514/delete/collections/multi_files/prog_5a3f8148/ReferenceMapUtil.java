import org.apache.commons.collections4.map.ReferenceMap;

public class ReferenceMapUtil {
    private ReferenceMap<String, Integer> map = new ReferenceMap<>();

    public void addEntry(String key, Integer value) {
        /* write */ map.put(key, value);
    }

    public Integer getEntry(String key) {
        return map.get(key);
    }
}
