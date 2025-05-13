import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SetMultimap<String, String> multimap = HashMultimap.create();
        
        /* write */ multimap.put("key1", "value1");
        
        /* read */ Set<String> values = multimap.get("key1");
        
        for (String value : values) {
            System.out.println(value);
        }
    }
}