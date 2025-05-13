import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ReferenceMap<String, Integer> referenceMap = new ReferenceMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        // Populate the HashMap with some values
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Add some values to the ArrayList
        arrayList.add("Hello");
        arrayList.add("World");

        /* write */ referenceMap.put("key", 42);

        // Perform operations on the HashMap
        String fruit = hashMap.get("B");
        System.out.println("Fruit from HashMap: " + fruit);

        // Perform operations on the ArrayList
        String greeting = arrayList.get(0) + " " + arrayList.get(1);
        System.out.println("Greeting from ArrayList: " + greeting);

        // More complex operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Retrieve the value from ReferenceMap
        /* read */ Integer value = referenceMap.get("key");
        System.out.println("Value from ReferenceMap: " + value);

        // Perform additional operations
        for (String key : hashMap.keySet()) {
            System.out.println("Key from HashMap: " + key);
        }

        for (String item : arrayList) {
            System.out.println("Item from ArrayList: " + item);
        }
    }
}