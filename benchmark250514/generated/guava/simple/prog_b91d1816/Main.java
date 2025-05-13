import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        /* write */ multimap.put("key", 42);
        /* read */ List<Integer> values = multimap.get("key");
        System.out.println(values);
    }
}