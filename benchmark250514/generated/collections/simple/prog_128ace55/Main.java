import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        AbstractMultiValuedMap<String, Integer> multiValuedMap = new HashSetValuedHashMap<>();
        
        /* write */ multiValuedMap.put("key1", 10);
        
        /* read */ Collection<Integer> values = multiValuedMap.get("key1");
        
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}