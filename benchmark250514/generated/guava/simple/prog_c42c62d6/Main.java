import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();

        // Use the builder to associate a class with an instance
        /* write */ builder.put(String.class, "Hello, World!");

        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();

        // Read the instance associated with the String class
        /* read */ String value = map.getInstance(String.class);

        // Print the value
        System.out.println(value);
    }
}