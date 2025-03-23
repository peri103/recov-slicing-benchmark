import com.google.common.collect.TreeMultimap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        /* write */ multimap.put("key1", 10);
        /* read */ Collection<Integer> values = multimap.get("key1");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}