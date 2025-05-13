import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = LinkedHashMultimap.create();
        
        /* write */ multimap.put("key1", "value1");
        
        /* read */ String value = multimap.get("key1").iterator().next();
        System.out.println(value);
    }
}