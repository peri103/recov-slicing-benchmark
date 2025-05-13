import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> baseMap = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> map = TransformedMultiValuedMap.transformingMap(baseMap, null, null);
        
        /* write */ map.put("key1", 42);
        /* read */ Integer value = map.get("key1").iterator().next();
        System.out.println(value);
    }
}