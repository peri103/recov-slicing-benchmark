import com.google.common.collect.LinkedListMultimap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        /* write */ multimap.put("key1", 42);
        /* read */ List<Integer> values = multimap.get("key1");
        System.out.println(values);
    }
}