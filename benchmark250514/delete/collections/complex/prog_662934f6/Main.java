import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.collections4.map.LRUMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using LinkedMap which is a concrete implementation
        AbstractOrderedMapDecorator<String, Integer> map = new LinkedMap<>();
        AbstractOrderedMapDecorator<String, String> anotherMap = new LinkedMap<>();
        AbstractOrderedMapDecorator<String, Integer> lruMap = new LRUMap<>(5);

        /* write */ map.put("key", 42);

        // Add more elements to the map
        map.put("anotherKey", 100);
        map.put("thirdKey", 200);

        // Use another map for different operations
        anotherMap.put("first", "Hello");
        anotherMap.put("second", "World");

        // Perform some operations on the LRUMap
        lruMap.put("A", 1);
        lruMap.put("B", 2);
        lruMap.put("C", 3);
        
        // Access elements in the map
        int anotherValue = map.get("anotherKey");
        System.out.println("Another value: " + anotherValue);

        // Access elements in anotherMap
        String greeting = anotherMap.get("first") + " " + anotherMap.get("second");
        System.out.println("Greeting: " + greeting);

        // Access elements in the LRUMap
        int lruValue = lruMap.get("B");
        System.out.println("LRU Value: " + lruValue);

        // Some unrelated computation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ int value = map.get("key");

        System.out.println("Original value: " + value);

        // Further unrelated operations
        lruMap.put("D", 4);
        lruMap.put("E", 5);

        int lruValue2 = lruMap.get("E");
        System.out.println("New LRU Value: " + lruValue2);
    }
}