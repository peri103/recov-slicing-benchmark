import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSetMultimap.Builder as SetBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder<String, String> builder = ImmutableListMultimap.builder();
        SetBuilder<String, Integer> setBuilder = ImmutableSetMultimap.builder();
        Map<String, Integer> map = new HashMap<>();

        // Adding elements to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Use the map to populate the setBuilder
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            setBuilder.put(entry.getKey(), entry.getValue());
        }

        // Create an ImmutableSetMultimap from the setBuilder
        ImmutableSetMultimap<String, Integer> setMultimap = setBuilder.build();

        // Print the ImmutableSetMultimap
        System.out.println("ImmutableSetMultimap: " + setMultimap);

        /* write */ builder.put("key", "value");

        // Some additional operations
        for (int i = 0; i < 5; i++) {
            builder.put("key" + i, "value" + i);
        }

        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, String> multimap = builder.build();

        // Iterate over the keys and values
        for (String key : multimap.keySet()) {
            System.out.println("Key: " + key + " -> Values: " + multimap.get(key));
        }

        // Access the original write-read pair
        /* read */ java.util.List<String> values = multimap.get("key");
        System.out.println("Read values for 'key': " + values);
    }
}