import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Original StrBuilder operations
        StrBuilder strBuilder = new StrBuilder("Hello World!");
        /* write */ strBuilder.deleteCharAt(5);

        // Additional complex code using ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Manipulating the ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 1);
        }

        // Using HashMap for additional complexity
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Iterating and printing HashMap values
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Further operations on StrBuilder
        strBuilder.append(" How are you?");
        strBuilder.insert(0, "Greeting: ");

        // Final read operation on StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println(result);

        // Printing modified ArrayList
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}