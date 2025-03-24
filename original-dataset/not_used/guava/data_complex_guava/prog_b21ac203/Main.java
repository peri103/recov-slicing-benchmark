import com.google.common.util.concurrent.AtomicDouble;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AtomicDouble atomicDouble = new AtomicDouble(0.0);
        Map<String, Integer> map = new HashMap<>();
        
        // Adding some values to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        // Modifying the map
        for (String key : map.keySet()) {
            map.put(key, map.get(key) * 2);
        }
        
        /* write */ double newValue = atomicDouble.addAndGet(5.0);
        
        // Using the map after writing
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Performing some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
        
        /* read */ double value = atomicDouble.get();
        System.out.println("Value after write: " + newValue);
        System.out.println("Value read: " + value);
    }
}