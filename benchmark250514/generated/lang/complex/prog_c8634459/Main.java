import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Initialize the ArrayList with some values
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        // Perform some operations on the ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        map.put("sum", sum);

        // Use the write method on StrBuilder
        /* write */ strBuilder.setNewLineText("Hello World!");

        // Perform additional operations
        map.put("doubleSum", sum * 2);
        map.put("tripleSum", sum * 3);

        // Print out the values from the map
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Use the read method on StrBuilder
        /* read */ String value = strBuilder.toString();
        System.out.println("StrBuilder content: " + value);

        // Further operations on the ArrayList
        numbers.add(10);
        numbers.add(20);

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}