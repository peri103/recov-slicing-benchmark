import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.map.LinkedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedMap<String, Integer> baseMap = new LinkedMap<>();
        AbstractOrderedBidiMapDecorator<String, Integer> bidiMap = new AbstractOrderedBidiMapDecorator<>(baseMap);
        
        // Initialize a HashMap and perform operations on it
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform operations on bidiMap
        bidiMap.put("anotherKey", 200);
        int anotherValue = bidiMap.get("anotherKey");
        System.out.println("Another Value: " + anotherValue);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to 10: " + sum);

        // More operations on HashMap
        hashMap.put("D", "Date");
        hashMap.put("E", "Elderberry");

        for (String key : hashMap.keySet()) {
            System.out.println("Fruit: " + hashMap.get(key));
        }

        /* write */ bidiMap.put("key", 100);

        // Perform some arithmetic operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of 1 to 5: " + product);

        // Access the value from bidiMap
        /* read */ int value = bidiMap.get("key");
        
        System.out.println("Value from bidiMap: " + value);

        // Final operations on HashMap
        hashMap.put("F", "Fig");
        hashMap.put("G", "Grape");

        for (String key : hashMap.keySet()) {
            System.out.println("Final Fruit: " + hashMap.get(key));
        }
    }
}