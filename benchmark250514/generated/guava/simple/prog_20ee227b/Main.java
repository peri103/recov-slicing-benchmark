import com.google.common.collect.TreeMultimap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        /* write */ multimap.put("key", 42);
        /* read */ Set<Integer> values = multimap.get("key");
        System.out.println(values);
    }
}