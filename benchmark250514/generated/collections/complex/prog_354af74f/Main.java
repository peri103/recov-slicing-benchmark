import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, String> map = new MultiValueMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // Adding elements to the HashMap
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        /* write */ map.put("key", "value");
        
        // Performing some operations with HashMap
        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        System.out.println("Sum of HashMap values: " + sum);
        
        // Performing operations with ArrayList
        for (int num : list) {
            System.out.println("ArrayList item: " + num);
        }
        
        /* read */ String value = (String) map.get("key");
        
        System.out.println("Read value from MultiValueMap: " + value);
        
        // Further operations with ArrayList
        list.add(50);
        list.add(100);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Final ArrayList item: " + list.get(i));
        }
    }
}