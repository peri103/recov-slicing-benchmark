import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardXYToolTipGenerator object
        StandardXYToolTipGenerator toolTipGenerator = new StandardXYToolTipGenerator();
        
        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Set the number format using the write method
        /* write */ toolTipGenerator.setNumberFormat(numberFormat);

        // Create an ArrayList and add some elements
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Print the elements of the ArrayList
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // Create a HashMap and populate it with key-value pairs
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 50);
        fruitPrices.put("Cherry", 200);

        // Print the keys and values of the HashMap
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (Integer price : fruitPrices.values()) {
            sum += price;
        }
        System.out.println("Total price: " + sum);

        // Retrieve the number format using the read method
        /* read */ NumberFormat retrievedFormat = toolTipGenerator.getNumberFormat();

        // Print the retrieved number format to ensure it matches the set format
        System.out.println("Number format is set correctly: " + retrievedFormat.equals(numberFormat));

        // Additional logic to make the program more complex
        int averagePrice = sum / fruitPrices.size();
        System.out.println("Average price: " + averagePrice);

        // Iterate over the ArrayList and print elements with their index
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("Index: " + i + ", Fruit: " + stringList.get(i));
        }
    }
}