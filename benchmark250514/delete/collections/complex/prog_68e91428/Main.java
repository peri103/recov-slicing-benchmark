import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Original map setup
        Map<String, Integer> originalMap = new HashMap<>();
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(originalMap);
        
        // Additional collections
        List<Integer> numberList = new ArrayList<>();
        Map<String, String> stringMap = new HashMap<>();
        
        // Populate numberList
        for (int i = 1; i <= 5; i++) {
            numberList.add(i * 10);
        }
        
        // Populate stringMap
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");
        
        // Modify original map to reflect in unmodifiable map
        /* write */ originalMap.put("key", 42);
        
        // Perform operations on numberList
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers in list: " + sum);
        
        // Perform operations on stringMap
        StringBuilder concatenatedValues = new StringBuilder();
        for (String value : stringMap.values()) {
            concatenatedValues.append(value).append(" ");
        }
        System.out.println("Concatenated string values: " + concatenatedValues.toString().trim());
        
        // Reading from the unmodifiable map
        /* read */ Integer value = unmodifiableMap.get("key");
        
        System.out.println("Value from unmodifiable map: " + value);

        // Additional operations to increase complexity
        List<Map.Entry<String, String>> entryList = new ArrayList<>(stringMap.entrySet());
        for (Map.Entry<String, String> entry : entryList) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}