import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Initialize the underlying map and transformation functions
        MultiValuedMap<String, String> underlyingMap = new ArrayListValuedHashMap<>();
        Function<String, String> keyTransformer = Function.identity();
        Function<String, String> valueTransformer = Function.identity();

        // Create the TransformedMultiValuedMap
        TransformedMultiValuedMap<String, String> transformedMap = new TransformedMultiValuedMap<>(underlyingMap, keyTransformer, valueTransformer);

        // Write to the map
        /* write */ transformedMap.put("key", "value");

        // Read from the map
        /* read */ String readValue = transformedMap.get("key").iterator().next();
        System.out.println(readValue);
    }
}