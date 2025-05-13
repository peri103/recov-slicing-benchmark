import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Use the write method to build the map
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.put(String.class, "Hello, World!").build();
        
        // Use the read method to retrieve the instance
        /* read */ String value = map.getInstance(String.class);
        
        // Output the value
        System.out.println(value);
    }
}