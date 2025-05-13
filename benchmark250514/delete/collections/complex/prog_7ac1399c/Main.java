import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Original map and unmodifiable map
        Map<String, Integer> modifiableMap = new HashMap<>();
        UnmodifiableMap<String, Integer> map = UnmodifiableMap.unmodifiableMap(modifiableMap);
        
        // Additional map for complexity
        Map<String, Integer> additionalMap = new TreeMap<>();
        additionalMap.put("alpha", 10);
        additionalMap.put("beta", 20);
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(25);
        
        Collections.sort(list);
        for (Integer num : list) {
            System.out.println("Sorted list item: " + num);
        }
        
        /* write */ modifiableMap.put("key1", 100);
        
        additionalMap.put("gamma", 30);
        for (Map.Entry<String, Integer> entry : additionalMap.entrySet()) {
            System.out.println("Additional map entry: " + entry.getKey() + " = " + entry.getValue());
        }
        
        list.addAll(additionalMap.values());
        System.out.println("List after adding map values: " + list);
        
        /* read */ int value = map.get("key1");
        System.out.println(value);
        
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of list: " + sum);
    }
}