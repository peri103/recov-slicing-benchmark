import org.apache.commons.collections4.map.Flat3Map;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Flat3Map<String, Integer> map = new Flat3Map<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("country", "Wonderland");
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* write */ map.put("key", 42);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        Map<String, Double> doubleMap = new HashMap<>();
        doubleMap.put("pi", 3.14159);
        doubleMap.put("e", 2.71828);
        
        for (String key : doubleMap.keySet()) {
            System.out.println(key + ": " + doubleMap.get(key));
        }
        
        /* read */ int value = map.get("key");
        System.out.println("Value from Flat3Map: " + value);
        
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}