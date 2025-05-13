import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableClassToInstanceMap with a specific class-instance mapping
        ImmutableClassToInstanceMap<String> map = /* write */ ImmutableClassToInstanceMap.of(String.class, "Hello, World!");
        
        // Retrieve the instance associated with the specified class
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
    }
}