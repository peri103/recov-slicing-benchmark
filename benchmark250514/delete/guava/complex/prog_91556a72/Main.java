import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Use putInstance to write a value
        /* write */ builder.putInstance(String.class, "Hello, World!");
        
        // Create another builder for a different map
        Builder<Object> anotherBuilder = ImmutableClassToInstanceMap.builder();
        anotherBuilder.putInstance(Integer.class, 42);
        
        // Build the map
        ImmutableClassToInstanceMap<Object> map = builder.build();
        ImmutableClassToInstanceMap<Object> anotherMap = anotherBuilder.build();
        
        // Perform some unrelated operations
        ImmutableMap<String, Integer> simpleMap = ImmutableMap.of("One", 1, "Two", 2, "Three", 3);
        int sum = 0;
        for (Integer value : simpleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in simpleMap: " + sum);
        
        // Use getInstance to read the value
        /* read */ String value = map.getInstance(String.class);
        
        // Print the value
        System.out.println(value);
        
        // Read a value from another map
        Integer intValue = anotherMap.getInstance(Integer.class);
        System.out.println("Value from another map: " + intValue);
        
        // Perform more operations
        ImmutableMap<String, String> stringMap = ImmutableMap.of("A", "Apple", "B", "Banana", "C", "Cherry");
        for (String key : stringMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + stringMap.get(key));
        }
    }
}