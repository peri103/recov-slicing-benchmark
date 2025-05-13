import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ImmutableClassToInstanceMap.Builder
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an instance of String to the builder with String.class as the key
        /* write */ builder.put(String.class, "Hello, World!");
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Retrieve the instance using String.class as the key
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
    }
}