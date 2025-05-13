import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> alwaysTrue = obj -> true; // A predicate that always returns true
        MultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(new LinkedMap<>(), alwaysTrue, alwaysTrue);

        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println(value);
    }
}