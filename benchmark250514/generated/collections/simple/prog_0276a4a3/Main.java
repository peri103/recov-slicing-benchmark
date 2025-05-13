import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Define a simple transformer that returns the input value as is
        Transformer<String, String> transformer = new Transformer<String, String>() {
            public String transform(String input) {
                return input;
            }
        };

        // Create a MultiValuedMap and wrap it with a TransformedMultiValuedMap
        MultiValuedMap<String, String> originalMap = new ArrayListValuedHashMap<>();
        TransformedMultiValuedMap<String, String> transformedMap = TransformedMultiValuedMap.transformedMap(originalMap, null, transformer);

        // Use the write method
        /* write */ transformedMap.put("key", "value");

        // Use the read method
        /* read */ Collection<String> values = transformedMap.get("key");

        // Print the values to verify the read operation
        for (String value : values) {
            System.out.println(value);
        }
    }
}