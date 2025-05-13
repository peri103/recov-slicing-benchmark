import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(map);

        /* write */ map.put("key1", 10);
        /* read */ Integer value = unmodifiableMap.get("key1").iterator().next();
        System.out.println(value);
    }
}