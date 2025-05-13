import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an instance to the map using the builder
        /* write */ builder.put(String.class, "Hello World");

        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();

        // Retrieve the instance from the map
        /* read */ String value = map.getInstance(String.class);

        // Print the retrieved value
        System.out.println(value);
    }
}