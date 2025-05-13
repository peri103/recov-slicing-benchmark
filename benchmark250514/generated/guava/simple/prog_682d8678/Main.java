import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class Main {
    public static void main(String[] args) {
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        
        /* write */ multimap.put("key", 42);
        
        /* read */ Integer value = multimap.get("key").get(0);
        
        System.out.println(value);
    }
}