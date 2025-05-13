import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();
        TransformedMap<String, String> transformedMap = TransformedMap.transformedMap(
            originalMap,
            key -> key.toUpperCase(),
            value -> value.toLowerCase()
        );

        /* write */ transformedMap.put("Key", "Value");

        // Additional unrelated code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("One", 1);
        anotherMap.put("Two", 2);
        anotherMap.put("Three", 3);
        
        int total = 0;
        for (String key : anotherMap.keySet()) {
            total += anotherMap.get(key);
        }
        
        System.out.println("Total from anotherMap: " + total);
        
        // More complex operations
        Map<String, List<Integer>> mapOfLists = new HashMap<>();
        mapOfLists.put("Even", new ArrayList<>());
        mapOfLists.put("Odd", new ArrayList<>());
        
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                mapOfLists.get("Even").add(i);
            } else {
                mapOfLists.get("Odd").add(i);
            }
        }
        
        System.out.println("Even numbers: " + mapOfLists.get("Even"));
        System.out.println("Odd numbers: " + mapOfLists.get("Odd"));
        
        /* read */ String value = transformedMap.get("Key");
        System.out.println(value);
    }
}