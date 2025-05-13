import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.LinkedMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize a LinkedMap to be used by TransformedMultiValuedMap
        LinkedMap<String, String> linkedMap = new LinkedMap<>();

        // Create a TransformedMultiValuedMap using the LinkedMap
        MultiValuedMap<String, String> map = TransformedMultiValuedMap.transformedMap(
                linkedMap, null, null);

        /* write */ map.put("key", "value");

        /* read */ Collection<String> values = map.get("key");

        // Output the values stored for the key
        for (String value : values) {
            System.out.println(value);
        }
    }
}