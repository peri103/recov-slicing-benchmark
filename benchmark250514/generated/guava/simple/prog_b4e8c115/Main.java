import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Write an instance to the map using the builder
        /* write */ builder.put(String.class, "Hello, World!");

        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Read the instance from the map
        /* read */ String value = map.getInstance(String.class);
        
        // Print the value read from the map
        System.out.println(value);
    }
}