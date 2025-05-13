import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new TransformedMultiValuedMap<>(new HashedMap<>());
        
        /* write */ map.put("key", 42);
        
        /* read */ Collection<Integer> values = map.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}