import com.google.common.collect.ImmutableMultimap;

public class Main {
    public static void main(String[] args) {
        // ImmutableMultimap does not have a direct put method since it's immutable.
        // We need to use the builder to add entries and then build the multimap.
        ImmutableMultimap.Builder<String, Integer> builder = ImmutableMultimap.builder();
        
        /* write */ builder.put("key", 42);
        
        ImmutableMultimap<String, Integer> multimap = builder.build();
        
        /* read */ int value = multimap.get("key").iterator().next();
        
        System.out.println(value);
    }
}