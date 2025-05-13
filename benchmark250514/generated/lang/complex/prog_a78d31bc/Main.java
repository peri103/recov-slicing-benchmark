import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Adding key-value pairs to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Using the StrBuilder appendSeparator method
        /* write */ strBuilder.appendSeparator("-");
        
        // Additional operations
        for (String fruit : list) {
            strBuilder.append(fruit).appendSeparator(", ");
        }
        
        // Complex operation with map
        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value % 2 != 0) {
                strBuilder.append(key).append(" is odd; ");
            }
        }

        // Final read from StrBuilder
        /* read */ String value = strBuilder.toString();
        System.out.println(value);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More operations with map
        if (map.containsKey("Banana")) {
            System.out.println("Banana is in the map with value: " + map.get("Banana"));
        }
    }
}