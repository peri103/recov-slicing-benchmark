import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an ImmutableClassToInstanceMap builder
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Use the write method once to put an instance
        /* write */ builder.putInstance(String.class, "Hello, World!");

        // Build the immutable map
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Use the read method once to get the instance
        /* read */ String value = map.getInstance(String.class);
        
        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}