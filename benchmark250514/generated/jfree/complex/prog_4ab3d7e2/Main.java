import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a ValueAxis object using NumberAxis as a concrete implementation
        ValueAxis axis = new NumberAxis();

        // Create a Range object to be used in the setRange method
        Range range = new Range(0.0, 10.0);

        // Use the write method setRange to set the range on the axis
        /* write */ axis.setRange(range);

        // Initialize an ArrayList and perform some operations
        ArrayList<Double> numbers = new ArrayList<>();
        for (double i = 0.0; i < 5.0; i += 1.0) {
            numbers.add(i * 2.0);
        }

        // Perform calculations using the ArrayList
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();
        System.out.println("Average of numbers: " + average);

        // Perform some unrelated calculations
        double squareSum = 0.0;
        for (double num : numbers) {
            squareSum += Math.pow(num, 2);
        }
        System.out.println("Sum of squares: " + squareSum);

        // Use the read method getRange to retrieve the range from the axis
        /* read */ Range retrievedRange = axis.getRange();

        // Print the retrieved range to ensure it matches the set range
        System.out.println("Retrieved Range: " + retrievedRange);

        // More unrelated operations
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }
}