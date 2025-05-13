import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Using the builder to put an instance of Integer
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.putInstance(Integer.class, 42).build();
        
        // Retrieve the instance of Integer from the map
        /* read */ Integer value = map.getInstance(Integer.class);
        
        // Print the retrieved value
        System.out.println(value);
    }
}