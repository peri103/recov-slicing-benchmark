import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello, World!");

        // Additional unrelated code to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Populate the ArrayList with numbers
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Populate the HashMap with some key-value pairs
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Perform operations on the ArrayList
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Perform operations on the HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        /* write */ strBuilder.substring(0, 5); // The substring method is used here but does not modify the original StrBuilder object

        // More complex operations before reading
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 1);
        }

        // Print modified numbers
        for (int number : numbers) {
            System.out.println("Modified Number: " + number);
        }

        /* read */ String value = strBuilder.toString();
        System.out.println(value); // Output should be "Hello, World!" since substring does not alter the StrBuilder object

        // Final operations on HashMap
        map.put("four", 4);
        map.put("five", 5);

        for (String key : map.keySet()) {
            System.out.println("Final Key: " + key + ", Final Value: " + map.get(key));
        }
    }
}