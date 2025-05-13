import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> originalMap = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(originalMap, 
            key -> key.toUpperCase(), 
            value -> value * 2);

        /* write */ transformedMap.put("key", 10);

        /* read */ Collection<Integer> values = transformedMap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}