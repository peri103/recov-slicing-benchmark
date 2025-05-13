import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

public class Main {
    public static void main(String[] args) {
        // Initialize the map with TruePredicate for both keys and values
        MultiValuedMap<String, String> baseMap = new MultiValueMap<>();
        Predicate<String> keyPredicate = TruePredicate.truePredicate();
        Predicate<String> valuePredicate = TruePredicate.truePredicate();
        
        // Create a PredicatedMultiValuedMap
        PredicatedMultiValuedMap<String, String> map = new PredicatedMultiValuedMap<>(baseMap, keyPredicate, valuePredicate);
        
        // Use the write method
        /* write */ map.put("key", "value");
        
        // Use the read method
        /* read */ Object value = map.get("key");
        
        // Print the value
        System.out.println(value);
    }
}