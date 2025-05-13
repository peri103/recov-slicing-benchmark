import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ReferenceMap<String, String> referenceMap = new ReferenceMap<>();
        Map<String, Integer> hashMap = new HashMap<>();

        // Populate the HashMap with some data
        for (int i = 0; i < 5; i++) {
            hashMap.put("key" + i, i * 10);
        }

        // Print values from HashMap
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println("HashMap value: " + hashMap.get("key" + i));
        }

        // Perform operations on ReferenceMap
        /* write */ referenceMap.put("key", "value");

        // Add more key-value pairs to ReferenceMap
        for (int i = 0; i < 3; i++) {
            referenceMap.put("extraKey" + i, "extraValue" + i);
        }

        // Print all values from ReferenceMap except the original key
        for (int i = 0; i < 3; i++) {
            System.out.println("ReferenceMap value: " + referenceMap.get("extraKey" + i));
        }

        // Perform some calculations
        int sum = 0;
        for (int value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of HashMap values: " + sum);

        // Read the original value from ReferenceMap
        /* read */ String value = referenceMap.get("key");
        System.out.println("Original ReferenceMap value: " + value);

        // Perform some operations with the read value
        String modifiedValue = value + "_modified";
        System.out.println("Modified value: " + modifiedValue);
    }
}