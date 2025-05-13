import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ReferenceMap<String, Integer> map = new ReferenceMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        Set<Integer> hashSet = new HashSet<>();

        // Adding elements to HashMap
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Adding elements to HashSet
        for (int i = 0; i < 5; i++) {
            hashSet.add(i * 10);
        }

        // Using the ReferenceMap
        /* write */ map.put("key", 42);

        // Iterating over HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Iterating over HashSet
        for (Integer num : hashSet) {
            System.out.println("HashSet Element: " + num);
        }

        // Performing some calculations
        int sum = 0;
        for (Integer num : hashSet) {
            sum += num;
        }
        System.out.println("Sum of HashSet Elements: " + sum);

        // Reading from the ReferenceMap
        /* read */ Integer value = map.get("key");
        System.out.println("Value from ReferenceMap: " + value);

        // Further operations with ReferenceMap
        map.put("anotherKey", 100);
        Integer anotherValue = map.get("anotherKey");
        System.out.println("Another Value from ReferenceMap: " + anotherValue);
    }
}