import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.PredicateUtils;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        ArrayListValuedHashMap<String, Integer> baseMap = new ArrayListValuedHashMap<>();
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(baseMap, PredicateUtils.notNullPredicate(), PredicateUtils.notNullPredicate());

        HashSetValuedHashMap<String, String> anotherMap = new HashSetValuedHashMap<>();
        anotherMap.put("hello", "world");
        anotherMap.put("foo", "bar");

        /* write */ map.put("key", 42);

        for (String key : anotherMap.keySet()) {
            System.out.println("Values for " + key + ": " + anotherMap.get(key));
        }

        int sum = 0;
        for (Integer val : map.get("key")) {
            sum += val;
        }

        System.out.println("Sum of values: " + sum);

        /* read */ Integer value = map.get("key").iterator().next();
        
        System.out.println("Read value: " + value);

        PredicatedMultiValuedMap<String, String> thirdMap = new PredicatedMultiValuedMap<>(new ArrayListValuedHashMap<>(), PredicateUtils.notNullPredicate(), PredicateUtils.notNullPredicate());
        thirdMap.put("apple", "fruit");
        thirdMap.put("carrot", "vegetable");

        for (String key : thirdMap.keySet()) {
            System.out.println("Category for " + key + ": " + thirdMap.get(key));
        }
    }
}