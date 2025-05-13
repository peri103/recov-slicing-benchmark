import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableMultimap.builder();
        Map<String, String> map = new HashMap<>();
        
        // Populate the map with some data
        map.put("name", "Alice");
        map.put("age", "30");
        map.put("city", "Wonderland");
        
        // Perform some operations on the map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Use another ImmutableMultimap for different data
        Builder<String, String> stringBuilder = ImmutableMultimap.builder();
        stringBuilder.put("fruit", "apple");
        stringBuilder.put("fruit", "banana");
        stringBuilder.put("vegetable", "carrot");
        
        ImmutableMultimap<String, String> stringMultimap = stringBuilder.build();
        System.out.println("Fruits: " + stringMultimap.get("fruit"));
        
        /* write */ builder.put("key1", 100);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
        
        ImmutableMultimap<String, Integer> multimap = builder.build();
        
        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 natural numbers: " + product);
        
        /* read */ Integer value = multimap.get("key1").iterator().next();
        
        System.out.println(value);
        
        // Final operations with map
        map.put("country", "Fantasia");
        System.out.println("Updated map: " + map);
    }
}