import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Create a transformer that does nothing
        Transformer<Object, Object> transformer = new Transformer<Object, Object>() {
            @Override
            public Object transform(Object input) {
                return input;
            }
        };

        // Initialize the MultiValuedMap
        MultiValuedMap<String, Integer> originalMap = new ArrayListValuedHashMap<>();
        MultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformedMap(originalMap, transformer, transformer);

        // Write a value to the map
        /* write */ transformedMap.put("key", 42);

        // Read the value from the map
        /* read */ Integer value = transformedMap.get("key").iterator().next();

        // Print the value
        System.out.println(value);
    }
}