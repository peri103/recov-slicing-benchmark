import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

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

        // Create a HashMap and populate it
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "John");
        hashMap.put("city", "New York");

        // Perform operations on HashMap
        String name = hashMap.get("name");
        System.out.println("Name: " + name);

        // Create another MultiValuedMap without predicates
        MultiValuedMap<String, String> anotherMap = new MultiValueMap<>();
        anotherMap.put("fruit", "apple");
        anotherMap.put("fruit", "banana");

        // Iterate and print values from anotherMap
        for (String fruit : anotherMap.get("fruit")) {
            System.out.println("Fruit: " + fruit);
        }

        // Complex operation using the original map
        int sum = 0;
        for (Integer number : map.get("key")) {
            sum += number;
        }

        // More operations on HashMap
        hashMap.put("country", "USA");
        hashMap.put("city", "Los Angeles");

        // Print updated HashMap values
        System.out.println("Updated City: " + hashMap.get("city"));
        System.out.println("Country: " + hashMap.get("country"));

        /* read */ Integer value = map.get("key").iterator().next(); // As get returns a Collection

        System.out.println(value);
    }
}