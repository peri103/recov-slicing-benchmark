import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CategoryAxis
        CategoryAxis categoryAxis = new CategoryAxis();
        
        // Create a CategoryLabelPositions object to set
        CategoryLabelPositions positions = CategoryLabelPositions.STANDARD;
        
        // Create an instance of NumberAxis for additional complexity
        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setAutoRangeIncludesZero(false);
        
        // Initialize some variables
        double[] data = {1.0, 2.5, 3.8, 4.6};
        double sum = 0.0;
        
        // Perform some calculations
        for (double value : data) {
            sum += value;
        }
        
        // Output the sum
        System.out.println("Sum of data: " + sum);
        
        // Write operation: Set the category label positions
        /* write */ categoryAxis.setCategoryLabelPositions(positions);
        
        // Perform more operations with NumberAxis
        double range = numberAxis.getRange().getLength();
        System.out.println("Range length: " + range);
        
        // Calculate average
        double average = sum / data.length;
        System.out.println("Average of data: " + average);
        
        // Read operation: Get the category label positions
        /* read */ CategoryLabelPositions retrievedPositions = categoryAxis.getCategoryLabelPositions();
        
        // Print the result to verify the read value matches the written value
        System.out.println("Positions match: " + retrievedPositions.equals(positions));
        
        // Additional operations with NumberAxis
        numberAxis.setRange(0.0, 10.0);
        System.out.println("New range: " + numberAxis.getRange());
        
        // More calculations
        double variance = 0.0;
        for (double value : data) {
            variance += Math.pow(value - average, 2);
        }
        variance /= data.length;
        System.out.println("Variance of data: " + variance);
    }
}