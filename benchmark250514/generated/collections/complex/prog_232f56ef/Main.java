import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.collections4.map.ListOrderedMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LinkedMap<String, Integer> map = new LinkedMap<>();
        ListOrderedMap<String, Integer> orderedMap = new ListOrderedMap<>();
        HashMap<String, String> hashMap = new HashMap<>();

        // Adding values to different maps
        orderedMap.put("first", 1);
        orderedMap.put("second", 2);
        hashMap.put("name", "John");
        hashMap.put("city", "New York");

        // Perform operations on orderedMap
        int sum = 0;
        for (String key : orderedMap.keySet()) {
            sum += orderedMap.get(key);
        }
        System.out.println("Sum of orderedMap values: " + sum);

        // Perform operations on hashMap
        StringBuilder sb = new StringBuilder();
        for (String key : hashMap.keySet()) {
            sb.append(hashMap.get(key)).append(" ");
        }
        System.out.println("Concatenated hashMap values: " + sb.toString().trim());

        /* write */ map.put("key", 100);

        // Other complex operations
        orderedMap.put("third", 3);
        orderedMap.put("fourth", 4);
        hashMap.put("country", "USA");

        int product = 1;
        for (String key : orderedMap.keySet()) {
            product *= orderedMap.get(key);
        }
        System.out.println("Product of orderedMap values: " + product);

        sb.setLength(0); // Clear StringBuilder
        for (String key : hashMap.keySet()) {
            sb.append(hashMap.get(key)).append(", ");
        }
        System.out.println("Updated hashMap values: " + sb.toString().trim());

        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}