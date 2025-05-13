import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = LinkedHashMultimap.create();

        /* write */ multimap.put("key", 42);

        /* read */ Collection<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}