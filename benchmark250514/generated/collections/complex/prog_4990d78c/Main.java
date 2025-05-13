import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using HashedMap which is a concrete implementation of AbstractHashedMap
        AbstractHashedMap<String, Integer> map = new HashedMap<>();
        
        // Write a value into the map
        /* write */ map.put("key", 42);

        // Initialize a BidiMap for additional operations
        BidiMap<String, String> bidiMap = new DualHashBidiMap<>();
        bidiMap.put("one", "1");
        bidiMap.put("two", "2");
        bidiMap.put("three", "3");

        // Perform operations on the BidiMap
        String valueForTwo = bidiMap.get("two");
        System.out.println("Value for 'two': " + valueForTwo);

        // Reverse lookup in BidiMap
        String keyForValue1 = bidiMap.getKey("1");
        System.out.println("Key for value '1': " + keyForValue1);

        // Initialize an ArrayList for further complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Process the ArrayList
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Read the value from the map
        /* read */ int value = map.get("key");

        // Print the value to ensure it was correctly written and read
        System.out.println("Value from map: " + value);

        // Additional operations on the map
        map.put("anotherKey", 100);
        int anotherValue = map.get("anotherKey");
        System.out.println("Another value from map: " + anotherValue);

        // More operations on the BidiMap
        bidiMap.removeValue("2");
        System.out.println("BidiMap after removing value '2': " + bidiMap);
    }
}