import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ImmutableClassToInstanceMap with a mapping
        ImmutableClassToInstanceMap<String> map = /* write */ ImmutableClassToInstanceMap.of(String.class, "Hello, World!");

        // Retrieve the value using getInstance method
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
    }
}