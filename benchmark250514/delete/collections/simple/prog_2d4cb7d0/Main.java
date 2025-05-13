import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = new TransformedMultiValuedMap<>(map, i -> i * 2, i -> i / 2);

        /* write */ transformedMap.put("key", 10);

        /* read */ Integer value = transformedMap.get("key").iterator().next();
        System.out.println(value);
    }
}