import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SetMultimap<String, Integer> multimap = HashMultimap.create();
        /* write */ multimap.put("key1", 42);
        /* read */ Set<Integer> values = multimap.get("key1");
        System.out.println(values);
    }
}