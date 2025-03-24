import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        /* write */ map.put("key", 123);
        
        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        
        ConcurrentHashMap<String, String> anotherMap = new ConcurrentHashMap<>();
        anotherMap.put("anotherKey", "Hello, World!");
        
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        String anotherValue = anotherMap.get("anotherKey");
        System.out.println(anotherValue);
        
        /* read */ Integer value = map.get("key");
        System.out.println("Original value: " + value);
        
        // More unrelated code
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        
        for (String str : strings) {
            System.out.println("Language: " + str);
        }
    }
}