import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ReferenceMap<String, String> map = new ReferenceMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding elements to hashMap
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "Value" + i);
        }

        // Manipulating hashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Performing operations with ReferenceMap
        /* write */ map.put("key", "value");
        String tempValue = map.get("key");
        if (tempValue != null) {
            System.out.println("Temporary value from ReferenceMap: " + tempValue);
        }

        // More complex operations
        for (int i = 0; i < 3; i++) {
            map.put("dynamicKey" + i, "dynamicValue" + i);
        }

        for (String key : map.keySet()) {
            System.out.println("ReferenceMap Key: " + key + ", Value: " + map.get(key));
        }

        // Final read operation
        /* read */ String value = map.get("key");
        System.out.println("Final value from ReferenceMap: " + value);

        // Additional logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}