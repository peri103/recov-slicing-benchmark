import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original ImmutableMap write-read pair
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        /* write */ builder.put("key", 42);

        // Additional unrelated code for complexity
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "Alice");
        simpleMap.put("city", "Wonderland");

        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using ImmutableList for additional complexity
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("apple");
        listBuilder.add("banana");
        listBuilder.add("cherry");
        ImmutableList<String> fruitList = listBuilder.build();
        
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        // Building the ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();

        // Perform calculations to increase complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Original read operation
        /* read */ Integer value = map.get("key");
        System.out.println(value);

        // Additional logic for complexity
        if (value != null && value > 40) {
            System.out.println("The value is greater than 40.");
        } else {
            System.out.println("The value is 40 or less.");
        }

        // More operations with the simpleMap
        simpleMap.put("occupation", "Adventurer");
        System.out.println("Occupation: " + simpleMap.get("occupation"));
    }
}