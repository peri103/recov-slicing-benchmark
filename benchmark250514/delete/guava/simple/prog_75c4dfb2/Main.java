import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Create an instance of the map
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Since ImmutableClassToInstanceMap is immutable, we need to use the builder to modify it
        builder.putInstance(String.class, "Hello, World!");
        
        // Rebuild the map with the new entry
        map = builder.build();
        
        /* write */ map = builder.build(); // Ensure the write operation is executed once
        
        /* read */ String value = map.getInstance(String.class); // Ensure the read operation is executed once
        System.out.println(value);
    }
}