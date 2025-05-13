import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Add some numbers to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        // Populate the map with some key-value pairs
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Perform operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform operations on the map
        int valueFromMap = map.get("Two");
        System.out.println("Value from map: " + valueFromMap);

        // Manipulate the StrBuilder
        /* write */ strBuilder.delete(5, 7);
        
        // Further operations on the list
        numbers.add(10);
        numbers.remove(0);
        
        // Further operations on the map
        map.put("Four", 4);
        map.remove("One");

        // Convert StrBuilder to String
        /* read */ String result = strBuilder.toString();
        System.out.println(result);

        // Print modified list
        System.out.println("Modified list: " + numbers);

        // Print modified map
        System.out.println("Modified map: " + map);
    }
}