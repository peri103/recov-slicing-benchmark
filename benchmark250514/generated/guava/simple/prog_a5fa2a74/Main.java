import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableMultimap.builder();
        /* write */ builder.put("key1", 100);

        ImmutableMultimap<String, Integer> multimap = builder.build();
        /* read */ Integer value = multimap.get("key1").iterator().next();
        
        System.out.println(value);
    }
}