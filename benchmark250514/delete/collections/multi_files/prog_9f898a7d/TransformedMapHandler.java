import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.Collection;

public class TransformedMapHandler {
    private MultiValuedMap<String, String> transformedMap;

    public TransformedMapHandler() {
        // Initialize a HashedMap to be used as the base map for TransformedMultiValuedMap
        HashedMap<String, Collection<String>> baseMap = new HashedMap<>();
        // Create a TransformedMultiValuedMap using the base map
        transformedMap = new TransformedMultiValuedMap<>(baseMap, null, null);
    }

    public void addValue(String key, String value) {
        /* write */ transformedMap.put(key, value);
    }

    public Collection<String> getValues(String key) {
        return transformedMap.get(key);
    }
}
