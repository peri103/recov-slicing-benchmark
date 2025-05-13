import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();
        /* write */ builder.put("rowKey", "columnKey", 42);
        
        // Creating a complex data structure
        Map<String, List<Integer>> complexMap = new HashMap<>();
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intList.add(i * 10);
        }
        complexMap.put("numbers", intList);

        // Perform operations on the complex data structure
        for (Map.Entry<String, List<Integer>> entry : complexMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            for (Integer num : entry.getValue()) {
                System.out.println("Value: " + num);
            }
        }

        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Additional unrelated operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        for (String str : stringList) {
            System.out.println(str);
        }

        /* read */ Integer value = table.get("rowKey", "columnKey");
        System.out.println(value);
        
        // More complex operations
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "Alice");
        simpleMap.put("city", "Wonderland");
        
        for (String key : simpleMap.keySet()) {
            System.out.println(key + ": " + simpleMap.get(key));
        }
    }
}