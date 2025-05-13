import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Create a transformer that does not change the value (identity transformation)
        Transformer<String, String> transformer = new Transformer<String, String>() {
            @Override
            public String transform(String input) {
                return input;
            }
        };

        // Create the underlying map
        MultiValuedMap<String, String> originalMap = new ArrayListValuedHashMap<>();

        // Create the transformed map
        TransformedMultiValuedMap<String, String> transformedMap = TransformedMultiValuedMap.transformedMap(originalMap, transformer, transformer);

        // Use the write method
        /* write */ transformedMap.put("key", "value");

        // Use the read method
        /* read */ String value = transformedMap.get("key").iterator().next();

        // Output the value
        System.out.println(value);
    }
}