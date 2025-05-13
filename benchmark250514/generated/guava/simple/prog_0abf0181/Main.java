import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableMultimap.builder();
        /* write */ builder.put("key", 42);
        ImmutableMultimap<String, Integer> multimap = builder.build();
        /* read */ Collection<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}