import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, String> multiValueMap = new MultiValueMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        MultiValueMap<Integer, String> multiValueMap2 = new MultiValueMap<>();
        
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        
        multiValueMap2.put(1, "apple");
        multiValueMap2.put(2, "banana");
        
        /* write */ multiValueMap.put("key", "value");
        
        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        
        for (Integer number : multiValueMap2.keySet()) {
            System.out.println("Number: " + number + ", Fruits: " + multiValueMap2.get(number));
        }
        
        String value = (String) multiValueMap.get("key").iterator().next();
        /* read */ System.out.println(value);
        
        MultiValueMap<String, Integer> multiValueMap3 = new MultiValueMap<>();
        multiValueMap3.put("A", 100);
        multiValueMap3.put("B", 200);
        
        for (String key : multiValueMap3.keySet()) {
            System.out.println("Key: " + key + ", Values: " + multiValueMap3.get(key));
        }
        
        System.out.println("Sum of HashMap values: " + sum);
    }
}