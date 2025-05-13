import org.apache.commons.collections4.map.AbstractSortedMap;
import org.apache.commons.collections4.map.TreeMap;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        AbstractSortedMap<String, Integer> map = new TreeMap<>();
        AbstractSortedMap<String, Integer> additionalMap = new TreeMap<>();
        HashedMap<String, String> hashedMap = new HashedMap<>();
        
        // Populate the additionalMap
        additionalMap.put("a", 1);
        additionalMap.put("b", 2);
        
        // Populate the hashedMap
        hashedMap.put("apple", "fruit");
        hashedMap.put("carrot", "vegetable");
        
        // Perform operations on hashedMap
        String category = hashedMap.get("apple");
        System.out.println("Category of apple: " + category);
        
        // Some intermediate operations
        int sum = 0;
        for (String key : additionalMap.keySet()) {
            sum += additionalMap.get(key);
        }
        System.out.println("Sum of additionalMap values: " + sum);
        
        /* write */ map.put("key", 42);
        
        // More operations
        for (String key : hashedMap.keySet()) {
            System.out.println(key + " is a " + hashedMap.get(key));
        }
        
        // Perform some calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
        
        /* read */ Integer value = map.get("key");
        System.out.println("Value from map: " + value);
        
        // Final operations
        int maxValue = Integer.MIN_VALUE;
        for (String key : additionalMap.keySet()) {
            int currentValue = additionalMap.get(key);
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }
        System.out.println("Max value in additionalMap: " + maxValue);
    }
}