import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        LogarithmicAxis logAxis = new LogarithmicAxis("Logarithmic Axis");
        NumberAxis numberAxis = new NumberAxis("Number Axis");

        // Configure number axis
        numberAxis.setRange(0.0, 100.0);
        numberAxis.setTickUnit(10.0);

        // Additional operations on number axis
        double lowerBound = numberAxis.getLowerBound();
        double upperBound = numberAxis.getUpperBound();
        System.out.println("Number Axis Range: " + lowerBound + " to " + upperBound);

        // Configure logarithmic axis
        /* write */ logAxis.setBase(10.0);

        // Perform operations on the logarithmic axis
        logAxis.setRange(1.0, 1000.0);
        logAxis.setLabel("Log Axis Label");

        // Additional operations on logarithmic axis
        double logRangeLower = logAxis.getLowerBound();
        double logRangeUpper = logAxis.getUpperBound();
        System.out.println("Logarithmic Axis Range: " + logRangeLower + " to " + logRangeUpper);

        // More complex operations
        for (int i = 1; i <= 10; i++) {
            double logValue = Math.pow(logAxis.getBase(), i);
            System.out.println("Log value for base " + logAxis.getBase() + " and exponent " + i + ": " + logValue);
        }

        // Final operation to read the base value
        /* read */ double base = logAxis.getBase();
        System.out.println("Base value of Logarithmic Axis: " + base);
    }
}