import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Create a HashMap to store some key-value pairs
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Process the HashMap and print its contents
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Write a value to the map using the builder
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.put(String.class, "Hello World").build();
        
        // Perform some unrelated operations
        int sum = 0;
        for (int value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashMap: " + sum);
        
        // Create another ImmutableClassToInstanceMap for different types
        Builder<Object> anotherBuilder = ImmutableClassToInstanceMap.builder();
        ImmutableClassToInstanceMap<Object> anotherMap = anotherBuilder.put(Integer.class, 42).build();
        Integer intValue = anotherMap.getInstance(Integer.class);
        System.out.println("Integer value from anotherMap: " + intValue);
        
        // Read the value from the original map
        /* read */ String value = (String) map.getInstance(String.class);
        
        // Print the read value
        System.out.println(value);
        
        // Additional complex operations
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");
        
        for (String key : stringMap.keySet()) {
            System.out.println("Fruit: " + stringMap.get(key));
        }
    }
}