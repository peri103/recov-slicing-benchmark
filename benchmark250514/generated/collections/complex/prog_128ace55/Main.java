import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AbstractMultiValuedMap<String, Integer> multiValuedMap = new HashSetValuedHashMap<>();
        AbstractMultiValuedMap<String, String> anotherMultiValuedMap = new HashSetValuedHashMap<>();
        
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("simpleKey", 100);
        
        anotherMultiValuedMap.put("anotherKey1", "value1");
        anotherMultiValuedMap.put("anotherKey2", "value2");
        
        Set<String> keys = simpleMap.keySet();
        for (String key : keys) {
            System.out.println("SimpleMap key: " + key + ", value: " + simpleMap.get(key));
        }
        
        /* write */ multiValuedMap.put("key1", 10);
        
        anotherMultiValuedMap.put("anotherKey3", "value3");
        Collection<String> anotherValues = anotherMultiValuedMap.get("anotherKey1");
        for (String value : anotherValues) {
            System.out.println("AnotherMultiValuedMap value: " + value);
        }
        
        simpleMap.put("simpleKey2", 200);
        
        /* read */ Collection<Integer> values = multiValuedMap.get("key1");
        
        for (Integer value : values) {
            System.out.println("MultiValuedMap value: " + value);
        }
        
        Set<String> anotherKeys = anotherMultiValuedMap.keySet();
        for (String key : anotherKeys) {
            System.out.println("AnotherMultiValuedMap key: " + key);
        }
    }
}