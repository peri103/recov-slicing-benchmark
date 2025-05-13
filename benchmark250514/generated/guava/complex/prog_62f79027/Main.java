import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        /* write */ builder.put("one", 1);
        
        // Create a HashMap and populate it with some values
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("apple", "fruit");
        hashMap.put("carrot", "vegetable");
        
        // Create an ImmutableMap from the HashMap
        ImmutableMap<String, String> immutableMap = ImmutableMap.copyOf(hashMap);
        
        // Retrieve and print values from the ImmutableMap
        System.out.println("apple is a " + immutableMap.get("apple"));
        System.out.println("carrot is a " + immutableMap.get("carrot"));
        
        // Perform some operations on the HashMap
        hashMap.put("banana", "fruit");
        hashMap.remove("carrot");
        
        // Build the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Perform some unrelated operations
        int sum = 0;
        for (Integer value : biMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in biMap: " + sum);
        
        /* read */ Integer value = biMap.get("one");
        
        // Output the value retrieved
        System.out.println(value);
        
        // Further manipulate the HashMap
        hashMap.put("potato", "vegetable");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " is a " + entry.getValue());
        }
    }
}