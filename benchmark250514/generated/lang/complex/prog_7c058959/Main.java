import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder
        StrBuilder strBuilder = new StrBuilder("Hello, World!");

        // Perform operations using ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }
        
        // Perform operations using HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        // Use StrBuilder to extract a substring
        /* write */ strBuilder = new StrBuilder(strBuilder.substring(0, 5)); // Extract substring "Hello"
        
        // Use the ArrayList and HashMap for computations
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of squares: " + sum);
        
        int mapSum = 0;
        for (String key : map.keySet()) {
            mapSum += map.get(key);
        }
        System.out.println("Sum of map values: " + mapSum);
        
        // Use StrBuilder's toString method
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
        
        // Further computations and manipulations
        StrBuilder additionalBuilder = new StrBuilder("Additional Text");
        additionalBuilder.append(" - Appended");
        System.out.println(additionalBuilder.toString());

        // Perform additional operations on numbers
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}