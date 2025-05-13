import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize PeriodAxis
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");

        // Create a RegularTimePeriod instance for testing
        RegularTimePeriod period = new Day();

        /* write */ periodAxis.setLast(period);

        /* read */ RegularTimePeriod lastPeriod = periodAxis.getLast();

        // Print the result to verify the correct period is read
        System.out.println("Last Period: " + lastPeriod);
    }
}