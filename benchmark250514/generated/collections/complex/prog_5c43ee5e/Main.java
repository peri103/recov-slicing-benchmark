import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(baseMap);
        
        // Additional unrelated code
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i * 5);
        }
        
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("name", "John");
        anotherMap.put("city", "New York");
        
        /* write */ fixedSizeMap.put("key", 42);
        
        // Process the ArrayList
        for (Integer number : arrayList) {
            System.out.println("ArrayList number: " + number);
        }
        
        // Process the other map
        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Some calculations
        int sum = 0;
        for (Integer number : arrayList) {
            sum += number;
        }
        System.out.println("Sum of ArrayList: " + sum);
        
        // Original read operation
        /* read */ int value = fixedSizeMap.get("key");
        
        System.out.println("Value from FixedSizeMap: " + value);
        
        // Additional logic to show complexity
        if (value > 30) {
            System.out.println("The value is greater than 30.");
        } else {
            System.out.println("The value is 30 or less.");
        }
        
        // More calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
    }
}