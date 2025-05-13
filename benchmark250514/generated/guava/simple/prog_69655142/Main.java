import com.google.common.collect.ImmutableListMultimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        
        /* write */ builder.put("key1", "value1");
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, String> multimap = builder.build();
        
        /* read */ String value = multimap.get("key1").get(0);
        
        System.out.println(value);
    }
}