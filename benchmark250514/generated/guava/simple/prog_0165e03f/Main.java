import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add a value to the builder
        /* write */ builder.put(String.class, "Hello, World!");
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Retrieve the value using getInstance
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
    }
}