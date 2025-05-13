import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator object
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();

        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Write: Set the NumberFormat instance
        /* write */ labelGenerator.setNumberFormat(numberFormat);

        // Create an ArrayList and add some elements
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Create a HashMap to store fruit counts
        HashMap<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Apple", 3);
        fruitCount.put("Banana", 2);
        fruitCount.put("Cherry", 5);

        // Iterate over the ArrayList and print each fruit
        for (String fruit : stringList) {
            System.out.println("Fruit: " + fruit);
        }

        // Retrieve and print the count of each fruit from the HashMap
        for (String fruit : fruitCount.keySet()) {
            int count = fruitCount.get(fruit);
            System.out.println("Count of " + fruit + ": " + count);
        }

        // Perform some calculations using NumberFormat
        double price = 19.99;
        double discount = 0.15;
        double discountedPrice = price - (price * discount);

        // Format the discounted price using NumberFormat
        String formattedPrice = numberFormat.format(discountedPrice);
        System.out.println("Discounted Price: " + formattedPrice);

        // Read: Retrieve the NumberFormat instance
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();

        // Print the retrieved NumberFormat to verify
        System.out.println("Retrieved NumberFormat: " + retrievedFormat);

        // More complex operations
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i * 5);
        }

        int sum = 0;
        for (int number : integerList) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Further operations with NumberFormat
        double total = sum * 1.08; // Adding 8% tax
        String formattedTotal = retrievedFormat.format(total);
        System.out.println("Total with tax: " + formattedTotal);
    }
}