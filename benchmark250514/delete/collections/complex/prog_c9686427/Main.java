import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap to be wrapped by UnmodifiableMap
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Wrap the HashMap with UnmodifiableMap
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(hashMap);
        
        // Initialize another HashMap and wrap it with UnmodifiableMap
        Map<String, String> stringMap = new HashMap<>();
        UnmodifiableMap<String, String> unmodifiableStringMap = UnmodifiableMap.unmodifiableMap(stringMap);

        // Initialize an ArrayList and populate it with some values
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }
        
        // Shuffle the ArrayList
        Collections.shuffle(arrayList);
        
        // Print the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + arrayList);

        // Put a value into the HashMap directly (since UnmodifiableMap is unmodifiable)
        /* write */ hashMap.put("key", 42);
        
        // Perform operations on the other map
        stringMap.put("hello", "world");
        stringMap.put("foo", "bar");
        
        // Access a value from the other map
        String strValue = unmodifiableStringMap.get("hello");
        System.out.println("String value from UnmodifiableMap: " + strValue);

        // Read the value using UnmodifiableMap's get method
        /* read */ Integer value = unmodifiableMap.get("key");
        
        // Print the value
        System.out.println("Integer value from UnmodifiableMap: " + value);

        // Perform operations on the ArrayList
        for (Integer num : arrayList) {
            System.out.println("ArrayList item: " + num);
        }
    }
}