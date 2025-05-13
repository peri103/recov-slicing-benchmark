import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = LinkedHashMultimap.create();
        
        /* write */ multimap.put("key1", "value1");
        
        /* read */ Collection<String> values = multimap.get("key1");
        
        for (String value : values) {
            System.out.println(value);
        }
    }
}