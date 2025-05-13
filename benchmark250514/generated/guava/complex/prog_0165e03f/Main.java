import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add a value to the builder
        /* write */ builder.put(String.class, "Hello, World!");
        
        // Create an unrelated ImmutableMap with some values
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of(
            "one", 1,
            "two", 2,
            "three", 3
        );
        
        // Iterate over the ImmutableMap and print its values
        for (String key : immutableMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + immutableMap.get(key));
        }
        
        // Perform some calculations
        int sum = 0;
        for (Integer value : immutableMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Retrieve the value using getInstance
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
        
        // Create another ImmutableClassToInstanceMap with different types
        ImmutableClassToInstanceMap.Builder<Object> anotherBuilder = ImmutableClassToInstanceMap.builder();
        anotherBuilder.put(Integer.class, 42);
        anotherBuilder.put(Double.class, 3.14);
        ImmutableClassToInstanceMap<Object> anotherMap = anotherBuilder.build();
        
        // Retrieve and print values from the anotherMap
        Integer intValue = anotherMap.getInstance(Integer.class);
        Double doubleValue = anotherMap.getInstance(Double.class);
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
    }
}