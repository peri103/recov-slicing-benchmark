import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();
        TransformedMap<String, String, String, String> transformedMap = TransformedMap.transformedMap(originalMap, null, null);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        Collections.shuffle(numbers);
        for (int num : numbers) {
            System.out.println("Shuffled number: " + num);
        }
        
        /* write */ transformedMap.put("key", "value");
        
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("one", 1);
        anotherMap.put("two", 2);
        anotherMap.put("three", 3);
        
        if (anotherMap.containsKey("two")) {
            int twoValue = anotherMap.get("two");
            System.out.println("Value for 'two': " + twoValue);
        }
        
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        /* read */ String value = transformedMap.get("key");
        System.out.println(value);
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of shuffled numbers: " + sum);
        
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        
        for (String str : strings) {
            System.out.println(str);
        }
    }
}