import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = LinkedHashMultimap.create();
        
        /* write */ multimap.put("key", "value");
        
        /* read */ Collection<String> values = multimap.get("key");
        
        for (String value : values) {
            System.out.println(value);
        }
    }
}