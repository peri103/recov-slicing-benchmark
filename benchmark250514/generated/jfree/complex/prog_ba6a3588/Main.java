import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the ValueAxis object
        ValueAxis axis = new NumberAxis();
        
        // Create a range and set it to the axis
        Range range = new Range(0.0, 10.0);
        /* write */ axis.setRange(range);
        
        // Perform some unrelated operations
        List<Double> values = new ArrayList<>();
        for (double i = 0.0; i <= 10.0; i += 2.0) {
            values.add(i);
        }
        
        double sum = 0.0;
        for (Double value : values) {
            sum += value;
        }
        
        System.out.println("Sum of values: " + sum);
        
        // Another unrelated operation
        List<String> messages = new ArrayList<>();
        messages.add("Hello");
        messages.add("World");
        
        for (String message : messages) {
            System.out.println(message);
        }
        
        // Read the range from the axis
        /* read */ Range readRange = axis.getRange();
        System.out.println("Range: " + readRange);
        
        // Further unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        
        int product = 1;
        for (Integer number : numbers) {
            product *= number;
        }
        
        System.out.println("Product of numbers: " + product);
    }
}