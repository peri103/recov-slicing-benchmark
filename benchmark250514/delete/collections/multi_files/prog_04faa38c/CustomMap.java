import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class CustomMap {
    private MultiValuedMap<String, Integer> modifiableMap = new ArrayListValuedHashMap<>();
    private UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(modifiableMap);

    public void addValue(String key, Integer value) {
        /* write */ modifiableMap.put(key, value);
    }

    public UnmodifiableMultiValuedMap<String, Integer> getUnmodifiableMap() {
        return unmodifiableMap;
    }
}
