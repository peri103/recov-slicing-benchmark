import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSetMultimap.Builder as SetBuilder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        Builder<String, Integer> builder = ImmutableListMultimap.builder();
        
        // Use the builder to add a key-value pair to the multimap
        /* write */ builder.put("key1", 100);
        
        // Create a builder for ImmutableSetMultimap
        SetBuilder<String, String> setBuilder = ImmutableSetMultimap.builder();
        
        // Use the builder to add multiple key-value pairs to the set multimap
        setBuilder.put("keyA", "valueA1");
        setBuilder.put("keyA", "valueA2");
        setBuilder.put("keyB", "valueB1");
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, String> setMultimap = setBuilder.build();
        
        // Perform operations on setMultimap
        java.util.Set<String> setValues = setMultimap.get("keyA");
        System.out.println("SetMultimap values for keyA: " + setValues);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, Integer> multimap = builder.build();
        
        // Retrieve the value associated with the key
        /* read */ java.util.List<Integer> values = multimap.get("key1");
        
        // Print the retrieved value
        System.out.println("ImmutableListMultimap values for key1: " + values);
        
        // Perform additional unrelated operations
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World!");
        System.out.println(sb.toString());
        
        // Iterate over the setMultimap
        for (String key : setMultimap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + setMultimap.get(key));
        }
    }
}