import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, String> map = new TransformedMultiValuedMap<>(new HashedMap<>());
        
        /* write */ map.put("key", "value");
        
        /* read */ Collection<String> values = map.get("key");
        
        for (String value : values) {
            System.out.println(value);
        }
    }
}