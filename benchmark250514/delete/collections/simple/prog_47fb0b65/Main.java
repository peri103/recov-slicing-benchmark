import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> multiValuedMap = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(
            multiValuedMap, 
            key -> key, 
            value -> value
        );

        /* write */ transformedMap.put("key1", 42);
        /* read */ Integer value = transformedMap.get("key1").iterator().next();
        System.out.println(value);
    }
}