import com.google.common.collect.ArrayListMultimap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        /* write */ multimap.put("key", 42);
        /* read */ List<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}