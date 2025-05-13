import com.google.common.collect.ImmutableMultimap;

public class Main {
    public static void main(String[] args) {
        // Since ImmutableMultimap is immutable, we need to use a builder to add elements
        ImmutableMultimap.Builder<String, String> builder = ImmutableMultimap.builder();
        
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableMultimap
        ImmutableMultimap<String, String> multimap = builder.build();
        
        /* read */ String value = multimap.get("key").iterator().next();
        
        System.out.println(value);
    }
}