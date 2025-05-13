import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis with a label
        PeriodAxis periodAxis = new PeriodAxis("Period Axis");

        // Create a RegularTimePeriod instance, here using Day as an example
        RegularTimePeriod period = new Day(1, 1, 2023);

        /* write */ periodAxis.setFirst(period);

        /* read */ RegularTimePeriod readPeriod = periodAxis.getFirst();

        // Print the read value
        System.out.println(readPeriod);
    }
}