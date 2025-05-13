import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();

        // Write a key-value pair to the builder
        /* write */ builder.put("key1", 100);

        // Create a HashMap and populate it with some data
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");

        // Create another ImmutableBiMap using a different builder
        ImmutableBiMap.Builder<String, String> builder2 = ImmutableBiMap.builder();
        builder2.put("X", "Xylophone");
        builder2.put("Y", "Yacht");
        ImmutableBiMap<String, String> biMap2 = builder2.build();

        // Perform some operations on the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        // Build the ImmutableBiMap from the original builder
        ImmutableBiMap<String, Integer> biMap = builder.build();

        // Read the value using the key from the ImmutableBiMap
        /* read */ Integer value = biMap.get("key1");

        // Print the read value
        System.out.println("Read value from ImmutableBiMap: " + value);

        // Use the second ImmutableBiMap
        for (String key : biMap2.keySet()) {
            System.out.println("ImmutableBiMap2 Entry: " + key + " -> " + biMap2.get(key));
        }

        // Create an ImmutableMap to demonstrate additional complexity
        ImmutableMap<String, Double> immutableMap = ImmutableMap.of("PI", 3.14159, "e", 2.71828);
        for (Map.Entry<String, Double> entry : immutableMap.entrySet()) {
            System.out.println("ImmutableMap Entry: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}