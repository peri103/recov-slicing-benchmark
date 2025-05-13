import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StandardCategoryToolTipGenerator
        StandardCategoryToolTipGenerator tooltipGenerator = new StandardCategoryToolTipGenerator();

        // Create a NumberFormat instance for setting the category format
        NumberFormat format = NumberFormat.getNumberInstance();
        
        /* write */ tooltipGenerator.setCategoryFormat(format);

        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Print the elements of the ArrayList
        for (String element : list) {
            System.out.println(element);
        }

        // Create a HashMap and add some key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key1", 100);
        map.put("Key2", 200);
        map.put("Key3", 300);

        // Retrieve and print a value from the HashMap
        Integer valueFromMap = map.get("Key2");
        System.out.println("Value from map: " + valueFromMap);

        // Perform some mathematical operations
        int a = 5;
        int b = 10;
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Retrieve the category format from the tooltip generator
        /* read */ NumberFormat retrievedFormat = tooltipGenerator.getCategoryFormat();

        // Print out the format to verify it was set and retrieved correctly
        System.out.println(retrievedFormat);

        // Create a nested loop to demonstrate complexity
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}