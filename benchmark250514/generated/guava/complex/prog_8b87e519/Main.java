import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initializing an ImmutableBiMap builder
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Adding an entry to the builder
        /* write */ builder.put("one", 1);
        
        // Creating another ImmutableMap to demonstrate complexity
        ImmutableMap<String, String> immutableMap = ImmutableMap.of("A", "Apple", "B", "Banana");

        // Performing some operations on immutableMap
        if (immutableMap.containsKey("A")) {
            System.out.println("Key 'A' is present with value: " + immutableMap.get("A"));
        }

        // Adding more entries to the builder
        builder.put("two", 2);
        builder.put("three", 3);
        
        // Building the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();

        // Performing operations on the biMap
        for (String key : biMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + biMap.get(key));
        }

        // Another unrelated operation to increase complexity
        int sum = 0;
        for (int value : biMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        // Reading the value associated with the key "one"
        /* read */ Integer value = biMap.get("one");
        System.out.println("The value for 'one' is: " + value);

        // More operations to further increase complexity
        ImmutableMap<String, Integer> anotherMap = ImmutableMap.of("X", 10, "Y", 20, "Z", 30);
        int product = 1;
        for (Integer val : anotherMap.values()) {
            product *= val;
        }
        System.out.println("Product of anotherMap values: " + product);
    }
}