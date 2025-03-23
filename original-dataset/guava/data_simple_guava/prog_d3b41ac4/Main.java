import com.google.common.collect.ArrayListMultimap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        /* write */ multimap.put("key1", 100);
        /* read */ List<Integer> values = multimap.get("key1");
        System.out.println(values.get(0));
    }
}