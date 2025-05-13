import com.google.common.collect.ImmutableBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Add a key-value pair to the builder
        /* write */ builder.put("one", 1);
        
        // Additional unrelated code to make the program more complex
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("apple", "fruit");
        hashMap.put("carrot", "vegetable");
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " is a " + entry.getValue());
        }
        
        // Build the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Additional code using similar API pairs
        ImmutableBiMap.Builder<String, String> stringBuilder = ImmutableBiMap.builder();
        stringBuilder.put("hello", "world");
        ImmutableBiMap<String, String> stringBiMap = stringBuilder.build();
        
        String greeting = stringBiMap.get("hello");
        System.out.println("Greeting: " + greeting);
        
        // Read the value associated with the key "one"
        /* read */ Integer value = biMap.get("one");
        
        // Print the value to verify
        System.out.println("Value associated with 'one': " + value);
        
        // More unrelated code for complexity
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}