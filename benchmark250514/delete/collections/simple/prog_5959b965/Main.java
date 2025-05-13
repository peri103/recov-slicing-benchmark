import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> baseMap = new HashedMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(baseMap, key -> key, value -> value);

        /* write */ transformedMap.put("key1", 100);
        /* read */ Integer value = transformedMap.get("key1").iterator().next();
        System.out.println(value);
    }
}