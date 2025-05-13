import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder with a sample string
        StrBuilder strBuilder = new StrBuilder("Hello World");
        
        // Additional complex logic with unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        int valueFromMap = map.getOrDefault("two", 0);
        System.out.println("Value from map: " + valueFromMap);

        // Manipulate the StrBuilder instance
        /* write */ strBuilder.setLength(5);

        // More unrelated logic
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append((char) ('A' + i));
        }
        System.out.println("StringBuilder content: " + sb.toString());

        // Reading from StrBuilder
        /* read */ String value = strBuilder.toString();
        System.out.println("StrBuilder content: " + value);
    }
}