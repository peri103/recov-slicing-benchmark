import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create a normal HashMap
        Map<String, Integer> normalMap = new HashMap<>();
        
        // Create a TransformedMap from the normalMap
        Map<String, Integer> transformedMap = TransformedMap.transformedMap(
                normalMap, 
                key -> key.toUpperCase(), // Key transformer
                value -> value + 1         // Value transformer
        );

        /* write */ transformedMap.put("key", 42);

        // Additional unrelated code to make the program more complex
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        Collections.sort(numberList, Collections.reverseOrder());
        
        for (Integer num : numberList) {
            System.out.println("Number: " + num);
        }

        // Another TransformedMap example
        Map<String, String> stringMap = new HashMap<>();
        Map<String, String> transformedStringMap = TransformedMap.transformedMap(
                stringMap,
                key -> key.toLowerCase(),
                value -> value.toUpperCase()
        );

        transformedStringMap.put("HELLO", "world");
        System.out.println("Transformed value: " + transformedStringMap.get("hello"));

        // Further operations
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ int value = transformedMap.get("KEY");
        
        System.out.println(value);

        // Additional loop for complexity
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}