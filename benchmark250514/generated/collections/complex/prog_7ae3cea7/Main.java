import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new HashSetValuedHashMap<>();
        MultiValuedMap<String, String> map2 = new ArrayListValuedHashMap<>();
        
        /* write */ map.put("key", 42);
        
        // Add more complex operations
        map2.put("name", "Alice");
        map2.put("name", "Bob");
        
        for (String name : map2.get("name")) {
            System.out.println("Name: " + name);
        }
        
        map.put("anotherKey", 100);
        map.put("anotherKey", 200);
        
        for (Integer num : map.get("anotherKey")) {
            System.out.println("Value: " + num);
        }
        
        // Perform some calculations
        int sum = 0;
        for (Integer num : map.get("anotherKey")) {
            sum += num;
        }
        System.out.println("Sum of values: " + sum);
        
        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println("Read value: " + value);
        
        // More operations
        map2.put("city", "New York");
        map2.put("city", "Los Angeles");
        
        for (String city : map2.get("city")) {
            System.out.println("City: " + city);
        }
        
        int count = map.get("anotherKey").size();
        System.out.println("Count of values for 'anotherKey': " + count);
    }
}