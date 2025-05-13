import com.google.common.collect.ImmutableMultimap;

public class Main {
    public static void main(String[] args) {
        ImmutableMultimap.Builder<String, Integer> builder = ImmutableMultimap.builder();
        /* write */ builder.put("key", 42);
        ImmutableMultimap<String, Integer> multimap = builder.build();
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}