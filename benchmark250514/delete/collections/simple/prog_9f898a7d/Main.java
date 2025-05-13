import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashedMap to be used as the base map for TransformedMultiValuedMap
        HashedMap<String, Collection<String>> baseMap = new HashedMap<>();
        
        // Create a TransformedMultiValuedMap using the base map
        MultiValuedMap<String, String> transformedMap = new TransformedMultiValuedMap<>(baseMap, null, null);
        
        // Use the write method
        /* write */ transformedMap.put("key1", "value1");
        
        // Use the read method
        /* read */ Collection<String> values = transformedMap.get("key1");
        
        // Print the values read from the map
        System.out.println(values);
    }
}