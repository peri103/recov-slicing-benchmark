import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator
        StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator();
        NumberFormat format = NumberFormat.getInstance();
        
        // Create a HashMap to store some data
        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("A", 100);
        dataMap.put("B", 200);
        dataMap.put("C", 300);
        
        // Create an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        // Perform operations on the ArrayList
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Manipulate the HashMap
        int totalValue = 0;
        for (String key : dataMap.keySet()) {
            totalValue += dataMap.get(key);
        }
        System.out.println("Total value from HashMap: " + totalValue);
        
        // Set the number format using the generator
        /* write */ generator.setNumberFormat(format);

        // Further operations on ArrayList
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum number: " + max);

        // Retrieve the number format from the generator
        /* read */ NumberFormat retrievedFormat = generator.getNumberFormat();
        
        // Print the result of the comparison
        System.out.println(retrievedFormat.equals(format)); // Should print true

        // Additional complex operations
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        
        StringBuilder concatenatedString = new StringBuilder();
        for (String str : strings) {
            concatenatedString.append(str).append(" ");
        }
        System.out.println("Concatenated String: " + concatenatedString.toString().trim());
    }
}