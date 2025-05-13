import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<String> list = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        // Additional operations before the original write
        list.add("Java");
        list.add("Programming");
        map.put(1, "Apache");
        map.put(2, "Commons");

        // More complex logic
        for (String item : list) {
            System.out.println("List item: " + item);
        }

        for (Integer key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }

        /* write */ strBuilder = new StrBuilder(strBuilder.substring(0, 5)); // Extract "Hello"

        // Additional operations after the original write
        list.add("StrBuilder");
        map.put(3, "Library");

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Complex logic using list and map
        list.add(map.get(1));
        list.add(map.get(2));
        list.add(map.get(3));

        for (String item : list) {
            System.out.println("Updated list item: " + item);
        }

        /* read */ String result = strBuilder.toString();
        System.out.println("Original read: " + result);

        // Final operations to demonstrate complexity
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Final list item at index " + i + ": " + list.get(i));
        }
    }
}