import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class CustomReferenceMap {
    private AbstractReferenceMap<String, Integer> map;

    public CustomReferenceMap() {
        // Initialize a ReferenceMap with reference type for both keys and values
        this.map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD);
    }

    public void putValue(String key, Integer value) {
        /* write */ map.put(key, value);
    }

    public Integer getValue(String key) {
        return map.get(key);
    }
}
