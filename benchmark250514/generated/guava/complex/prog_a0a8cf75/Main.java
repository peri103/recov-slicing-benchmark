import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ImmutableClassToInstanceMap.Builder
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an entry to the builder
        builder.put(String.class, "Hello, World!");
        
        // Create a HashMap and populate it with some data
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "Value " + i);
        }
        
        // Perform operations on the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Build the ImmutableClassToInstanceMap
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Some unrelated complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Retrieve the instance using the read method
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
        
        // Further complex operations
        Map<String, Integer> stringToIntegerMap = new HashMap<>();
        stringToIntegerMap.put("A", 1);
        stringToIntegerMap.put("B", 2);
        stringToIntegerMap.put("C", 3);
        
        int product = 1;
        for (Integer val : stringToIntegerMap.values()) {
            product *= val;
        }
        System.out.println("Product of values: " + product);
    }
}