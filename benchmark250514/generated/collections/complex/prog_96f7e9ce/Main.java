import org.apache.commons.collections4.map.Flat3Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Flat3Map<String, Integer> map = new Flat3Map<>();
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // Use HashMap to store some data
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        // Use ArrayList to store numbers
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }
        
        /* write */ map.put("key", 42);
        
        // Process data from HashMap
        String name = hashMap.get("name");
        String city = hashMap.get("city");
        System.out.println("Name: " + name + ", City: " + city);
        
        // Process data from ArrayList
        int sum = 0;
        for (Integer num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of ArrayList elements: " + sum);
        
        // Retrieve the value from Flat3Map
        /* read */ Integer value = map.get("key");
        System.out.println("Value from Flat3Map: " + value);
        
        // Additional operations with ArrayList
        arrayList.add(value);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList element at index " + i + ": " + arrayList.get(i));
        }
    }
}