import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");

        // Create a Day object to set as the last period
        Day lastPeriod = new Day(1, 1, 2023);

        // Write the last period using setLast method
        /* write */ periodAxis.setLast(lastPeriod);

        // Read the last period using getLast method
        /* read */ Day readLastPeriod = (Day) periodAxis.getLast();

        // Print the read value
        System.out.println("Last period: " + readLastPeriod);
    }
}