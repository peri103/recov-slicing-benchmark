import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogarithmicAxis logAxis = new LogarithmicAxis("Logarithmic Axis");
        NumberAxis numberAxis = new NumberAxis("Number Axis");
        List<Double> values = new ArrayList<>();
        
        // Setting some properties of numberAxis
        numberAxis.setAutoRangeIncludesZero(false);
        numberAxis.setUpperMargin(0.1);
        
        // Adding some values to the list
        for (int i = 1; i <= 5; i++) {
            values.add(Math.pow(10, i));
        }
        
        // Logarithmic axis operations
        /* write */ logAxis.setBase(10.0);
        
        // More operations on numberAxis
        numberAxis.setLowerBound(0.0);
        numberAxis.setUpperBound(100000.0);
        
        // Processing values
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        
        // Calculating average
        double average = sum / values.size();
        System.out.println("Average of values: " + average);
        
        // Final operations on logAxis
        double base = logAxis.getBase();
        System.out.println("Logarithmic Axis Base: " + base);
        
        // Additional operations to demonstrate complexity
        List<Double> logValues = new ArrayList<>();
        for (double value : values) {
            logValues.add(Math.log(value) / Math.log(base));
        }
        
        // Output log values
        System.out.println("Logarithmic Values:");
        for (double logValue : logValues) {
            System.out.println(logValue);
        }
    }
}