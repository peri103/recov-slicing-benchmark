import org.apache.commons.collections4.map.AbstractIterableMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractIterableMap<String, Integer> map = new HashedMap<>();
        
        // Initialize another map for demonstration
        AbstractIterableMap<String, String> anotherMap = new HashedMap<>();
        anotherMap.put("name", "Alice");
        anotherMap.put("city", "Wonderland");

        // Initialize a list and add elements
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        // Perform operations on the list
        for (int num : numberList) {
            System.out.println("Number: " + num);
        }
        
        // Add a new pair to the original map
        map.put("anotherKey", 100);

        // Perform operations on anotherMap
        String name = anotherMap.get("name");
        System.out.println("Name from anotherMap: " + name);
        
        /* write */ map.put("key", 42);

        // Perform operations after writing
        int anotherValue = map.get("anotherKey");
        System.out.println("Another value from map: " + anotherValue);

        // Perform more operations on numberList
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ int value = map.get("key");
        System.out.println(value);

        // Additional operations on anotherMap
        anotherMap.put("country", "Fantasy");
        String city = anotherMap.get("city");
        System.out.println("City from anotherMap: " + city);
    }
}