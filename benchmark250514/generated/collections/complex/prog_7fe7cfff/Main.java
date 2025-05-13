import org.apache.commons.collections4.map.ListOrderedMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Initialize HashMap
        hashMap.put("name", "John");
        hashMap.put("city", "New York");

        // Initialize ArrayList
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }

        // Perform operations with HashMap
        String name = hashMap.get("name");
        String city = hashMap.get("city");
        System.out.println("Name: " + name + ", City: " + city);

        // Perform operations with ArrayList
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of ArrayList elements: " + sum);

        /* write */ map.put("key", 42);

        // Additional operations using ListOrderedMap
        map.put("anotherKey", 84);
        int anotherValue = map.get("anotherKey");
        System.out.println("Another value: " + anotherValue);

        // More complex operations
        for (int i = 0; i < arrayList.size(); i++) {
            map.put("dynamicKey" + i, arrayList.get(i));
        }

        // Read the value from the ListOrderedMap
        /* read */ int value = map.get("key");
        System.out.println("Value from ListOrderedMap: " + value);

        // Print all dynamic keys
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Dynamic Key " + i + ": " + map.get("dynamicKey" + i));
        }
    }
}