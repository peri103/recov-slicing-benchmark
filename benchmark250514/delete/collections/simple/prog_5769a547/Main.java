import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.LinkedMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedMap to use as the base map for the TransformedMultiValuedMap
        LinkedMap<String, Integer> baseMap = new LinkedMap<>();
        
        // Create a TransformedMultiValuedMap without any transformation
        MultiValuedMap<String, Integer> multiValuedMap = TransformedMultiValuedMap.transformedMap(baseMap, null, null);
        
        /* write */ multiValuedMap.put("key", 42);
        
        /* read */ Collection<Integer> values = multiValuedMap.get("key");
        
        // Print the values to ensure the read method reads the value written by the write method
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}