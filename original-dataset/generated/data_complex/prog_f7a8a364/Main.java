import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        Map<String, Integer> anotherMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        // Adding elements to anotherMap
        anotherMap.put("Key1", 100);
        anotherMap.put("Key2", 200);

        // Adding elements to map
        /* write */ map.put(1, "Hello World");
        map.put(2, "Java Programming");

        // Processing list
        for (String element : list) {
            System.out.println("List Element: " + element);
        }

        // Processing anotherMap
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println("AnotherMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Some unrelated logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Reading from map
        /* read */ String value = map.get(1);
        System.out.println("Read from map: " + value);

        // More unrelated logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}