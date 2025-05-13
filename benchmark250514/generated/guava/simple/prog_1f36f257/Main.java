import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = ArrayListMultimap.create();
        
        /* write */ multimap.put("key", "value");
        
        /* read */ String value = multimap.get("key").iterator().next();
        
        System.out.println(value);
    }
}