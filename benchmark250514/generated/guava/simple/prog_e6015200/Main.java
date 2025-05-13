import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = HashMultimap.create();
        /* write */ multimap.put("key", 42);
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}