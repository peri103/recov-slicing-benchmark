import com.google.common.collect.SetMultimap;
import com.google.common.collect.HashMultimap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SetMultimap<String, Integer> multimap = HashMultimap.create();
        
        /* write */ multimap.put("key", 42);
        
        /* read */ Set<Integer> values = multimap.get("key");
        
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}