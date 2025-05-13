import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.apache.commons.collections4.map.LinkedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractLinkedMap<String, Integer> map = new LinkedMap<>();
        HashMap<String, String> anotherMap = new HashMap<>();
        
        anotherMap.put("A", "Apple");
        anotherMap.put("B", "Banana");
        
        System.out.println("Contents of anotherMap:");
        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        /* write */ map.put("key", 42);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        Map<String, Integer> thirdMap = new HashMap<>();
        thirdMap.put("X", 100);
        thirdMap.put("Y", 200);
        
        System.out.println("Contents of thirdMap:");
        for (Map.Entry<String, Integer> entry : thirdMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        /* read */ int value = map.get("key");
        System.out.println("Value from map: " + value);
        
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}