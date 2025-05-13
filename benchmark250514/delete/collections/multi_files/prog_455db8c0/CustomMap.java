import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class CustomMap {
    private MultiValuedMap<String, Integer> multiMap = new MultiValueMap<>();
    private UnmodifiableMultiValuedMap<String, Integer> unmodifiableMultiMap = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(multiMap);

    public void addValue(String key, Integer value) {
        /* write */ multiMap.put(key, value);
    }

    public UnmodifiableMultiValuedMap<String, Integer> getUnmodifiableMultiMap() {
        return unmodifiableMultiMap;
    }
}
