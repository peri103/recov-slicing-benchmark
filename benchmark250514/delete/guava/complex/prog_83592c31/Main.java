import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ImmutableClassToInstanceMap.Builder
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();

        // Add an instance of String to the builder with String.class as the key
        /* write */ builder.put(String.class, "Hello, World!");

        // Create a map to store additional values
        Map<Class<?>, Object> additionalMap = new HashMap<>();
        additionalMap.put(Integer.class, 123);
        additionalMap.put(Double.class, 456.78);

        // Add additional values to the builder
        for (Map.Entry<Class<?>, Object> entry : additionalMap.entrySet()) {
            builder.put(entry.getKey(), entry.getValue());
        }

        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();

        // Perform some operations with the map
        Integer intValue = map.getInstance(Integer.class);
        Double doubleValue = map.getInstance(Double.class);
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);

        // Retrieve the instance using String.class as the key
        /* read */ String value = map.getInstance(String.class);

        // Print the retrieved value
        System.out.println(value);

        // Additional complexity: perform calculations and print results
        int result = intValue * 2;
        double resultDouble = doubleValue / 2;
        System.out.println("Result of integer calculation: " + result);
        System.out.println("Result of double calculation: " + resultDouble);

        // Create a new map to demonstrate further operations
        Map<String, Integer> demoMap = new HashMap<>();
        demoMap.put("A", 10);
        demoMap.put("B", 20);
        demoMap.put("C", 30);

        // Iterate and print values from demoMap
        for (String key : demoMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + demoMap.get(key));
        }
    }
}