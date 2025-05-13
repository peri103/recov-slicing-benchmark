import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Create an instance of a class to store in the map
        String instance = "Hello, World!";
        
        /* write */ builder.putInstance(String.class, instance);
        
        // Build the immutable map
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        /* read */ String retrievedInstance = map.getInstance(String.class);
        
        System.out.println(retrievedInstance);
    }
}