import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class MultiValuedStore {
    private MultiValuedMap<String, Integer> map = new HashSetValuedHashMap<>();

    public void addValue(String key, Integer value) {
        /* write */ map.put(key, value);
    }

    public MultiValuedMap<String, Integer> getMap() {
        return map;
    }
}
