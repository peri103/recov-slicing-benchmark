import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create a mutable map to build the immutable map
        MutableClassToInstanceMap<Object> mutableMap = MutableClassToInstanceMap.create();
        
        // Use the write method to put an instance into the map
        /* write */ mutableMap.putInstance(String.class, "Hello, World!");
        
        // Build the immutable map from the mutable map
        ImmutableClassToInstanceMap<Object> immutableMap = ImmutableClassToInstanceMap.copyOf(mutableMap);
        
        // Use the read method to get the instance from the map
        /* read */ String value = immutableMap.getInstance(String.class);
        
        // Print the value
        System.out.println(value);
    }
}