import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> baseMap = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> map = new UnmodifiableMultiValuedMap<>(baseMap);

        /* write */ baseMap.put("key", 42);
        /* read */ Integer value = map.get("key").iterator().next();
        
        System.out.println(value);
    }
}