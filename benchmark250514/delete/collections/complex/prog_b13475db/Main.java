import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> baseMap = new MultiValueMap<>();
        TransformedMultiValuedMap<String, Integer> map = TransformedMultiValuedMap.transformingMap(baseMap, null, null);
        
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        
        int sum = 0;
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            sum += entry.getKey().charAt(0);
        }
        
        /* write */ map.put("key1", 42);
        
        simpleMap.put("C", "Cherry");
        simpleMap.put("D", "Date");
        
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
            System.out.println("Factorial of " + i + " is " + product);
        }
        
        int valueSum = 0;
        for (String key : simpleMap.keySet()) {
            valueSum += key.length();
        }
        
        /* read */ Integer value = map.get("key1").iterator().next();
        System.out.println(value);
        
        System.out.println("Sum of ASCII values of keys: " + sum);
        System.out.println("Sum of lengths of keys: " + valueSum);
    }
}