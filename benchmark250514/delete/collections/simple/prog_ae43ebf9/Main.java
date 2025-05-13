import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, String> originalMap = new MultiValueMap<>();
        TransformedMultiValuedMap<String, String> transformedMap = new TransformedMultiValuedMap<>(
                originalMap, null, null);

        /* write */ transformedMap.put("key", "value");
        /* read */ String value = transformedMap.get("key").iterator().next();
        System.out.println(value);
    }
}