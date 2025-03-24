import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableListMultimap.builder();
        /* write */ builder.put("key1", 42);
        ImmutableListMultimap<String, Integer> multimap = builder.build();
        /* read */ Integer value = multimap.get("key1").iterator().next();
        System.out.println(value);
    }
}