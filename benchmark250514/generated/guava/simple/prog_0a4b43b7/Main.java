import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an instance to the map
        /* write */ builder.put(String.class, "Hello, World!");
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Retrieve the instance from the map
        /* read */ String value = (String) map.getInstance(String.class);
        
        // Output the value
        System.out.println(value);
    }
}