import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashSetValuedHashMap and perform operations
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        /* write */ map.put("key", 42);

        // Additional operations on a HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        // Print values from HashMap
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }

        // Perform operations on an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i * 2);
        }

        // Print values from ArrayList
        for (int num : arrayList) {
            System.out.println(num);
        }

        // Read operation from HashSetValuedHashMap
        /* read */ Set<Integer> values = map.get("key");
        for (Integer value : values) {
            System.out.println("Read value from map: " + value);
        }

        // More operations on ArrayList
        arrayList.addAll(values);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList element: " + arrayList.get(i));
        }
    }
}