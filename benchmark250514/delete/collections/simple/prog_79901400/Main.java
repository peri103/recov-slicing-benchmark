import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(map);
        
        /* write */ map.put("key", "value");
        
        /* read */ Collection<String> values = unmodifiableMap.get("key");
        
        for (String value : values) {
            System.out.println(value);
        }
    }
}