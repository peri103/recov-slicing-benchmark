import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, String> multiKeyMap = new MultiKeyMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Additional code using HashMap
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Original write operation
        /* write */ multiKeyMap.put("key1", "key2", "value");

        // More operations
        hashMap.put("four", 4);
        hashMap.put("five", 5);

        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in HashMap: " + sum);

        // Original read operation
        /* read */ String value = multiKeyMap.get("key1", "key2");
        System.out.println(value);

        // Additional code using MultiKeyMap
        multiKeyMap.put("key3", "key4", "anotherValue");
        String anotherValue = multiKeyMap.get("key3", "key4");
        System.out.println(anotherValue);
    }
}