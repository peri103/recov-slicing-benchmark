import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.PredicateUtils;

public class Main {
    public static void main(String[] args) {
        ArrayListValuedHashMap<String, Integer> baseMap = new ArrayListValuedHashMap<>();
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(baseMap, PredicateUtils.notNullPredicate(), PredicateUtils.notNullPredicate());

        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key").iterator().next();
        
        System.out.println(value);
    }
}