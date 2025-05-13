import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, String> builder = ImmutableMultimap.builder();
        /* write */ builder.put("key", "value");
        ImmutableMultimap<String, String> multimap = builder.build();
        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}