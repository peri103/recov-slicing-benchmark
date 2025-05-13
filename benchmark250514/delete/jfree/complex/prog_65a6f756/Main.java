import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        LogarithmicAxis logAxis = new LogarithmicAxis("Log Axis");
        NumberAxis numberAxis = new NumberAxis("Number Axis");

        // Set some properties for the NumberAxis
        numberAxis.setLowerBound(0.0);
        numberAxis.setUpperBound(100.0);
        numberAxis.setTickUnit(10.0);

        // Perform operations with NumberAxis
        double lowerBound = numberAxis.getLowerBound();
        double upperBound = numberAxis.getUpperBound();
        double tickUnit = numberAxis.getTickUnit();

        System.out.println("Number Axis Lower Bound: " + lowerBound);
        System.out.println("Number Axis Upper Bound: " + upperBound);
        System.out.println("Number Axis Tick Unit: " + tickUnit);

        // Set the base for LogarithmicAxis
        /* write */ logAxis.setBase(10.0);

        // Perform some unrelated calculations
        double result = Math.pow(lowerBound + upperBound, tickUnit);
        System.out.println("Calculated Result: " + result);

        // Use LogarithmicAxis properties
        double logBase = 2.0;
        logAxis.setBase(logBase);
        double logValue = logAxis.calculateLog(50);
        System.out.println("Logarithmic Value: " + logValue);

        // Read the base value from LogarithmicAxis
        /* read */ double baseValue = logAxis.getBase();
        System.out.println("Logarithmic Axis Base: " + baseValue);

        // Perform additional operations
        double valueAt10 = logAxis.calculateLog(10);
        System.out.println("Logarithmic Value at 10: " + valueAt10);

        double valueAt100 = logAxis.calculateLog(100);
        System.out.println("Logarithmic Value at 100: " + valueAt100);
    }
}