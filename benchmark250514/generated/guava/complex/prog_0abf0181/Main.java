import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableMultimap.builder();
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding some unrelated logic to make the program more complex
        for (int i = 0; i < 5; i++) {
            hashMap.put("key" + i, i * 10);
        }
        
        // Using the map to perform some operations
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Map Entry: " + entry.getKey() + " -> " + entry.getValue());
        }
        
        // Original write operation
        /* write */ builder.put("key", 42);
        ImmutableMultimap<String, Integer> multimap = builder.build();
        
        // Adding more unrelated logic
        hashMap.put("extraKey", 100);
        if (hashMap.containsKey("extraKey")) {
            System.out.println("Extra Key Value: " + hashMap.get("extraKey"));
        }
        
        // Some additional operations using a different data structure
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Original read operation
        /* read */ Collection<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
        
        // Further complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}