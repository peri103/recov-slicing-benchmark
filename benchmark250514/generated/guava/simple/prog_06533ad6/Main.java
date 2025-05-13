import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an instance to the builder
        builder.put(String.class, "Hello, World!");
        
        // Build the ImmutableClassToInstanceMap
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Retrieve the instance from the map
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
    }
}