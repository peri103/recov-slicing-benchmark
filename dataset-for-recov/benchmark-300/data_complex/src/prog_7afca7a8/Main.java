import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        /* write */ map.put("key", 42);

        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        ConcurrentHashMap<String, String> stringMap = new ConcurrentHashMap<>();
        stringMap.put("greeting", "Hello, World!");

        for (Integer num : numbers) {
            System.out.println(num);
        }

        String greeting = stringMap.get("greeting");
        System.out.println(greeting);

        /* read */ int value = map.get("key");
        System.out.println("The value associated with 'key' is: " + value);

        // More unrelated code
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}