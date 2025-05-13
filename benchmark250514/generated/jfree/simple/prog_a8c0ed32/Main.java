import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");

        // Create a RegularTimePeriod instance to use with the write and read methods
        RegularTimePeriod period = new Day(1, 1, 2023);

        // Use the write method to set the first period
        /* write */ periodAxis.setFirst(period);

        // Use the read method to get the first period
        /* read */ RegularTimePeriod firstPeriod = periodAxis.getFirst();

        // Print the result to verify that the read method retrieves the value written by the write method
        System.out.println(firstPeriod);
    }
}