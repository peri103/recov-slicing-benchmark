import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        UnmodifiableMap<String, Integer> map = UnmodifiableMap.unmodifiableMap(originalMap);
        
        /* write */ originalMap.put("key", 42);
        
        // Unrelated complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }
        
        Collections.sort(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("name", "Alice");
        anotherMap.put("city", "Wonderland");
        
        UnmodifiableMap<String, String> unmodifiableAnotherMap = UnmodifiableMap.unmodifiableMap(anotherMap);
        String name = unmodifiableAnotherMap.get("name");
        System.out.println("Name: " + name);
        
        // More unrelated operations
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        
        for (String word : words) {
            System.out.println(word.toUpperCase());
        }
        
        /* read */ int value = map.get("key");
        System.out.println(value);
        
        // Further operations
        Map<Integer, String> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            numberMap.put(numbers.get(i), "Number: " + numbers.get(i));
        }
        
        UnmodifiableMap<Integer, String> unmodifiableNumberMap = UnmodifiableMap.unmodifiableMap(numberMap);
        String numberStr = unmodifiableNumberMap.get(25);
        System.out.println("Retrieved: " + numberStr);
    }
}