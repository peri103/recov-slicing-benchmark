import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Create a sample class and instance
        Class<String> sampleClass = String.class;
        String sampleInstance = "Hello, World!";
        
        /* write */
        builder.put(sampleClass, sampleInstance);
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        /* read */
        String value = map.getInstance(sampleClass);
        
        // Output the read value
        System.out.println(value);
    }
}