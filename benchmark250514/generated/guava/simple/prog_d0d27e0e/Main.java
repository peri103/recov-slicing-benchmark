import com.google.common.collect.LinkedListMultimap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        
        /* write */ multimap.put("key", 42);
        
        /* read */ List<Integer> values = multimap.get("key");
        System.out.println(values.get(0));
    }
}