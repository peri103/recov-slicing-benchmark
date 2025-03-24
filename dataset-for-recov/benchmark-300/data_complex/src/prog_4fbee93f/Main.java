import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Adding elements to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        /* write */ set.add("value");

        // Iterating through the list and printing elements
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        // Iterating through the map and printing key-value pairs
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        /* read */ boolean containsValue = set.contains("value");
        System.out.println("Contains 'value': " + containsValue);

        // Adding more elements to the set
        set.add("anotherValue");
        set.add("yetAnotherValue");

        // Checking if the set contains the new elements
        System.out.println("Contains 'anotherValue': " + set.contains("anotherValue"));
        System.out.println("Contains 'yetAnotherValue': " + set.contains("yetAnotherValue"));
    }
}