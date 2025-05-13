import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> modifiableMap = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> map = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        /* write */ modifiableMap.put("key", 42);
        
        /* read */ Integer value = map.get("key").iterator().next();
        
        System.out.println(value);
    }
}