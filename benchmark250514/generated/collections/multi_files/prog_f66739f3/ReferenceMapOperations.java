import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class ReferenceMapOperations {
    private AbstractReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);

    public void addEntry(String key, Integer value) {
        /* write */ map.put(key, value);
    }

    public Integer getEntry(String key) {
        return map.get(key);
    }
}
