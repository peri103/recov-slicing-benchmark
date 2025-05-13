import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a mutable map to use with UnmodifiableMap
        Map<String, Integer> mutableMap = new HashMap<>();
        mutableMap.put("key", 42); // Adding an initial value to the mutable map

        // Create an unmodifiable map from the mutable map
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(mutableMap);

        // Create an ArrayList and add some values
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }

        // Process the ArrayList
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of ArrayList: " + sum);

        // Attempt to write using put method
        // Since UnmodifiableMap does not allow direct modification, we will modify the original map
        /* write */ mutableMap.put("newKey", 100);

        // Additional logic using another map
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "world");
        String greeting = stringMap.get("hello");
        System.out.println("Greeting: " + greeting);

        // Read the value using the get method
        /* read */ int value = unmodifiableMap.get("newKey");

        // Output the read value
        System.out.println(value);

        // More complex logic using the ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            stringList.add("String " + i);
        }

        for (String str : stringList) {
            System.out.println("Processing: " + str);
        }

        // Final manipulation of the original map
        mutableMap.put("anotherKey", 200);
        int anotherValue = mutableMap.get("anotherKey");
        System.out.println("Another Value: " + anotherValue);
    }
}