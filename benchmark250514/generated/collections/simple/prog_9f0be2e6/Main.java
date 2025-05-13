import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a base map
        Map<String, String> baseMap = new HashMap<>();

        // Define transformers for keys and values
        Transformer<String, String> keyTransformer = input -> input.toUpperCase();
        Transformer<String, String> valueTransformer = input -> input.toLowerCase();

        // Create a TransformedMap with key and value transformers
        Map<String, String> transformedMap = TransformedMap.transformedMap(baseMap, keyTransformer, valueTransformer);

        /* write */ transformedMap.put("Key", "VALUE");

        /* read */ String value = transformedMap.get("KEY");
        System.out.println(value);
    }
}