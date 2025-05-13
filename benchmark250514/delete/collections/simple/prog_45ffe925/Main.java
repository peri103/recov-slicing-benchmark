import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.LinkedMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize a LinkedMap to use as the base map for the TransformedMultiValuedMap
        LinkedMap<String, String> baseMap = new LinkedMap<>();

        // Create a TransformedMultiValuedMap using the baseMap
        MultiValuedMap<String, String> transformedMap = TransformedMultiValuedMap.transformedMap(baseMap, null, null);

        /* write */ transformedMap.put("key1", "value1");

        /* read */ Collection<String> values = transformedMap.get("key1");

        // Print the values retrieved from the map
        for (String value : values) {
            System.out.println(value);
        }
    }
}