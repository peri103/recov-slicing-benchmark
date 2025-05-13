import org.apache.commons.collections4.map.AbstractSortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        AbstractSortedMap<Integer, String> map = new TreeMap<>();
        /* write */ map.put(1, "Hello World");

        // Additional code using HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("First", 100);
        hashMap.put("Second", 200);
        hashMap.put("Third", 300);

        // Perform some operations on the HashMap
        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        System.out.println("Sum of HashMap values: " + sum);

        // Additional code using TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Alpha", 10);
        treeMap.put("Beta", 20);
        treeMap.put("Gamma", 30);

        // Perform operations on TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // More operations on original map
        map.put(2, "Java Programming");
        map.put(3, "Apache Commons");
        map.put(4, "Collections Framework");

        // Perform some operations on the original map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Original read operation
        /* read */ String value = map.get(1);
        System.out.println(value);
    }
}