import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator object
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        // Initialize a NumberFormat object
        NumberFormat numberFormat = NumberFormat.getInstance();
        
        // Set the NumberFormat using the write method
        /* write */ labelGenerator.setNumberFormat(numberFormat);
        
        // Initialize a HashMap to store some values
        Map<String, Double> pieData = new HashMap<>();
        pieData.put("Category A", 45.0);
        pieData.put("Category B", 30.0);
        pieData.put("Category C", 25.0);
        
        // Calculate total percentage
        double totalPercentage = 0.0;
        for (Double value : pieData.values()) {
            totalPercentage += value;
        }
        
        // Print each category with its percentage
        for (Map.Entry<String, Double> entry : pieData.entrySet()) {
            String category = entry.getKey();
            Double percentage = entry.getValue();
            System.out.println("Category: " + category + ", Percentage: " + percentage + "%");
        }
        
        // Perform some unrelated operations
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Retrieve the NumberFormat using the read method
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();
        
        // Print out whether the retrieved format is the same as the one set
        System.out.println(retrievedFormat.equals(numberFormat));
        
        // Display total percentage
        System.out.println("Total Percentage: " + totalPercentage + "%");
    }
}