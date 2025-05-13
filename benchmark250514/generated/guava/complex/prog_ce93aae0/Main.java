import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, String> builder = ImmutableBiMap.builder();
        
        /* write */ builder.put("key", "value");
        
        // Additional unrelated code for complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);

        ImmutableMap<String, Integer> immutableMap = ImmutableMap.copyOf(hashMap);
        for (Map.Entry<String, Integer> entry : immutableMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Build the ImmutableBiMap
        ImmutableBiMap<String, String> biMap = builder.build();
        
        // More unrelated code for complexity
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashMap: " + sum);

        /* read */ String value = biMap.get("key");
        
        // Output the value
        System.out.println(value);

        // Additional code to manipulate and print hashMap entries
        hashMap.put("three", 3);
        for (String key : hashMap.keySet()) {
            System.out.println(key + " has value " + hashMap.get(key));
        }
    }
}