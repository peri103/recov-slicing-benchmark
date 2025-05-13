import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> multiMap = new MultiValueMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMultiMap = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(multiMap);
        
        /* write */ multiMap.put("key", 42);
        
        /* read */ Integer value = unmodifiableMultiMap.get("key").iterator().next();
        
        System.out.println(value);
    }
}