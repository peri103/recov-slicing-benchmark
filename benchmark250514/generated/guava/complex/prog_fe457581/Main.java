import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableList builder
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Additional unrelated code to make the program more complex
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        ImmutableSet.Builder<String> setBuilder = ImmutableSet.builder();
        setBuilder.add("Hello");
        setBuilder.add("World");
        ImmutableSet<String> set = setBuilder.build();
        
        for (String s : set) {
            System.out.println("Set element: " + s);
        }
        
        /* write */ builder.add(42);
        
        // More complex operations
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of map values: " + sum);
        
        // Build the ImmutableList
        ImmutableList<Integer> list = builder.build();
        
        // Additional operations with the list
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        System.out.println("Total of list values: " + total);
        
        /* read */ int value = list.get(0);
        System.out.println("Read value: " + value);
        
        // Further unrelated complex operations
        for (int i = 0; i < 5; i++) {
            map.put("key" + (i + 3), i * 50);
        }
        
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }
    }
}