import org.apache.commons.collections4.map.Flat3Map;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Flat3Map<String, Integer> map = new Flat3Map<>();
        HashMap<String, String> hashMap = new HashMap<>();
        Map<String, Double> doubleMap = new HashMap<>();

        /* write */ map.put("key", 100);
        
        // Adding elements to the HashMap
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Adding elements to the doubleMap
        doubleMap.put("X", 1.1);
        doubleMap.put("Y", 2.2);
        doubleMap.put("Z", 3.3);

        // Iterating over hashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform calculations using doubleMap
        double sum = 0;
        for (Double value : doubleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in doubleMap: " + sum);

        // Manipulating the Flat3Map
        map.put("anotherKey", 200);
        map.put("thirdKey", 300);

        // Accessing value from Flat3Map
        /* read */ Integer value = map.get("key");
        System.out.println(value);

        // Further operations on Flat3Map
        for (String key : map.keySet()) {
            System.out.println("Flat3Map Key: " + key + ", Value: " + map.get(key));
        }
    }
}