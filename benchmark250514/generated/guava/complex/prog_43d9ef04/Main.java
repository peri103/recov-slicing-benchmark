import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableSetMultimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key1", "value1");
        
        // Create another builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, Integer> setBuilder = ImmutableSetMultimap.builder();
        setBuilder.put("setKey1", 100);
        setBuilder.put("setKey2", 200);
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, Integer> setMultimap = setBuilder.build();
        
        // Perform some operations on setMultimap
        java.util.Set<Integer> setValues = setMultimap.get("setKey1");
        System.out.println("Set values for 'setKey1': " + setValues);
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, String> multimap = builder.build();
        
        // Perform some operations on multimap before reading
        java.util.List<String> additionalValues = multimap.get("key2");
        System.out.println("Values for 'key2': " + additionalValues);
        
        // Read the value associated with the key
        /* read */ java.util.List<String> values = multimap.get("key1");
        
        // Print the value
        System.out.println("Values for 'key1': " + values);
        
        // Further operations to increase complexity
        ImmutableListMultimap.Builder<String, String> anotherBuilder = ImmutableListMultimap.builder();
        anotherBuilder.put("anotherKey", "anotherValue");
        ImmutableListMultimap<String, String> anotherMultimap = anotherBuilder.build();
        
        java.util.List<String> anotherValues = anotherMultimap.get("anotherKey");
        System.out.println("Values for 'anotherKey': " + anotherValues);
    }
}