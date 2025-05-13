import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, String> builder = ImmutableListMultimap.builder();
        /* write */ builder.put("key", "value");
        ImmutableListMultimap<String, String> multimap = builder.build();
        /* read */ java.util.List<String> values = multimap.get("key");
        System.out.println(values);
    }
}