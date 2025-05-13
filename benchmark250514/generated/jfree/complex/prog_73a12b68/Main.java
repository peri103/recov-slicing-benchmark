import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis with a label
        PeriodAxis periodAxis = new PeriodAxis("Period Axis");

        // Create a RegularTimePeriod instance, here using Day as an example
        RegularTimePeriod period = new Day(1, 1, 2023);

        /* write */ periodAxis.setFirst(period);

        // Initialize another axis for additional complexity
        ValueAxis valueAxis = new NumberAxis("Value Axis");

        // Set some properties on the value axis
        valueAxis.setLowerBound(0.0);
        valueAxis.setUpperBound(100.0);

        // Perform some calculations using the value axis
        double range = valueAxis.getUpperBound() - valueAxis.getLowerBound();
        System.out.println("Range of Value Axis: " + range);

        // Create another RegularTimePeriod instance
        RegularTimePeriod period2 = new Day(2, 1, 2023);

        // Set the second period on the PeriodAxis
        periodAxis.setLast(period2);

        // Perform operations using the last period
        RegularTimePeriod lastPeriod = periodAxis.getLast();
        System.out.println("Last Period: " + lastPeriod);

        // More operations
        double midpoint = valueAxis.getLowerBound() + (range / 2);
        System.out.println("Midpoint of Value Axis: " + midpoint);

        // Retrieve the first period from the PeriodAxis
        /* read */ RegularTimePeriod readPeriod = periodAxis.getFirst();

        // Print the read value
        System.out.println("First Period: " + readPeriod);
    }
}