import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Write a value to the map using the builder
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.put(String.class, "Hello World").build();
        
        // Read the value from the map
        /* read */ String value = (String) map.getInstance(String.class);
        
        // Print the read value
        System.out.println(value);
    }
}