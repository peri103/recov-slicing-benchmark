import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.RegularTimePeriod;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");

        // Initialize a RegularTimePeriod object, using Day as an example
        RegularTimePeriod lastPeriod = new Day(1, 1, 2023);

        /* write */ periodAxis.setLast(lastPeriod);

        /* read */ RegularTimePeriod retrievedPeriod = periodAxis.getLast();

        // Print the retrieved value to verify
        System.out.println(retrievedPeriod);
    }
}