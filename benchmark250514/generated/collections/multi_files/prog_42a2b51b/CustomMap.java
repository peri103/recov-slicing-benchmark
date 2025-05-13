import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class CustomMap {
    private AbstractReferenceMap<String, String> map;

    public CustomMap() {
        map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);
    }

    public void putValue(String key, String value) {
        /* write */ map.put(key, value);
    }

    public String getValue(String key) {
        return map.get(key);
    }
}
