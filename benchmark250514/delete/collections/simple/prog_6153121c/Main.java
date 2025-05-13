import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the underlying map
        MultiValuedMap<String, Integer> underlyingMap = new MultiValueMap<>();
        
        // Create a TransformedMultiValuedMap with identity transformers (no transformation)
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(
            underlyingMap, 
            input -> input, // key transformer
            input -> input  // value transformer
        );

        /* write */ transformedMap.put("key", 42);
        
        /* read */ Integer value = transformedMap.get("key").iterator().next();
        
        System.out.println(value);
    }
}