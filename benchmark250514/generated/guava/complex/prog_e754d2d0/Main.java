import com.google.common.collect.ImmutableClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an instance to the map using the builder
        /* write */ builder.put(String.class, "Hello World");

        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();

        // Create a HashMap to store some additional information
        Map<String, Integer> infoMap = new HashMap<>();
        infoMap.put("First", 1);
        infoMap.put("Second", 2);
        infoMap.put("Third", 3);

        // Perform some operations on the infoMap
        for (Map.Entry<String, Integer> entry : infoMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Retrieve the instance from the ImmutableClassToInstanceMap
        /* read */ String value = map.getInstance(String.class);

        // Print the retrieved value
        System.out.println(value);

        // Additional operations on the ImmutableClassToInstanceMap
        // Create another builder and add different types of instances
        ImmutableClassToInstanceMap.Builder<Object> anotherBuilder = ImmutableClassToInstanceMap.builder();
        anotherBuilder.put(Integer.class, 42);
        anotherBuilder.put(Double.class, 3.14);

        // Build the new map
        ImmutableClassToInstanceMap<Object> anotherMap = anotherBuilder.build();

        // Retrieve and print instances from the new map
        Integer intValue = anotherMap.getInstance(Integer.class);
        Double doubleValue = anotherMap.getInstance(Double.class);

        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
    }
}