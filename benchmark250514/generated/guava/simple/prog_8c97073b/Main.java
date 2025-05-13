import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = HashMultimap.create();
        
        /* write */ multimap.put("key", "value");
        
        /* read */ String value = multimap.get("key").iterator().next();
        
        System.out.println(value);
    }
}