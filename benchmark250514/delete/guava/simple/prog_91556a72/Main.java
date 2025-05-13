import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Use putInstance to write a value
        /* write */ builder.putInstance(String.class, "Hello, World!");
        
        // Build the map
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Use getInstance to read the value
        /* read */ String value = map.getInstance(String.class);
        
        // Print the value
        System.out.println(value);
    }
}