import com.google.common.collect.HashBiMap;
import com.google.common.collect.LinkedListMultimap;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();

        // Additional code for complexity
        multimap.put("a", 100);
        multimap.put("b", 200);
        multimap.put("c", 300);

        int sum = 0;
        for (Integer value : multimap.values()) {
            sum += value;
        }
        
        System.out.println("Sum of multimap values: " + sum);

        /* write */ map.put("key", 123);

        // Further operations before reading
        map.put("anotherKey", 456);
        map.put("yetAnotherKey", 789);
        
        int total = 0;
        for (String key : map.keySet()) {
            total += map.get(key);
        }
        
        System.out.println("Total of map values: " + total);

        /* read */ Integer value = map.get("key");
        System.out.println("Read value: " + value);

        // Additional unrelated code
        HashBiMap<String, Integer> anotherMap = HashBiMap.create();
        anotherMap.put("x", 10);
        anotherMap.put("y", 20);
        
        int result = 0;
        for (String key : anotherMap.keySet()) {
            result += anotherMap.get(key);
        }
        
        System.out.println("Result of another map: " + result);
    }
}