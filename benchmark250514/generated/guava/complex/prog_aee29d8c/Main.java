import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an ImmutableSortedMap.Builder
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Initialize a HashMap for additional complexity
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        
        // Perform some operations on the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Fruit: " + hashMap.get(key));
        }
        
        // Initialize an ImmutableList for additional complexity
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("Hello");
        listBuilder.add("World");
        
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Perform operations on the ImmutableList
        ImmutableList<String> immutableList = listBuilder.build();
        for (String str : immutableList) {
            System.out.println(str);
        }
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        
        /* read */ Integer value = map.get("key1");
        
        System.out.println("Value from map: " + value);
        
        // Additional operations
        if (sum > 20) {
            System.out.println("Sum is greater than 20");
        } else {
            System.out.println("Sum is less or equal to 20");
        }
    }
}