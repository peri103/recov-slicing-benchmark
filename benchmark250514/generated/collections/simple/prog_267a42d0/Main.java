import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the base MultiValuedMap
        MultiValuedMap<String, Integer> baseMap = new ArrayListValuedHashMap<>();
        
        // Create a TransformedMultiValuedMap with no transformation (identity transformation)
        MultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformedMap(baseMap, null, null);
        
        /* write */ transformedMap.put("key", 42);
        
        /* read */ Integer value = transformedMap.get("key").iterator().next();
        
        System.out.println(value);
    }
}