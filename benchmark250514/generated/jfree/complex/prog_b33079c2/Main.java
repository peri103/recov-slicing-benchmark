import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        ArrayList<Double> values = new ArrayList<>();
        
        // Adding some values to the list
        for (double i = 0; i < 10; i++) {
            values.add(i * 10);
        }
        
        // Processing the values
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        
        double average = sum / values.size();
        
        /* write */ axis.setRange(new Range(0.0, average + 50.0));
        
        // Further operations on the list
        double max = Double.MIN_VALUE;
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        
        System.out.println("Max value in the list: " + max);
        
        // Additional operations
        double min = Double.MAX_VALUE;
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        
        System.out.println("Min value in the list: " + min);
        
        // Final read operation
        /* read */ Range range = axis.getRange();
        
        System.out.println("Range: " + range.getLowerBound() + " to " + range.getUpperBound());
    }
}