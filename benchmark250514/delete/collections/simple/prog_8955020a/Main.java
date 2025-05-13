import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        // Create a predicate that allows all entries
        Predicate<Object> predicate = new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
                return true;
            }
        };

        // Create a MultiValuedMap with a predicate
        MultiValuedMap<String, Integer> baseMap = new MultiValueMap<>();
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(baseMap, predicate, predicate);

        /* write */ map.put("key", 42);

        /* read */ Integer value = map.get("key").iterator().next(); // As get returns a Collection

        System.out.println(value);
    }
}