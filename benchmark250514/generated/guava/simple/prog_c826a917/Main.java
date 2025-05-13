import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Use the builder to add an instance
        String instance = "Hello, World!";
        /* write */ builder.put(String.class, instance);
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Read the instance from the map
        /* read */ String value = map.getInstance(String.class);
        
        // Print the value
        System.out.println(value);
    }
}