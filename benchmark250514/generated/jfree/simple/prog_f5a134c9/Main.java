import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis instance
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");

        // Create a Day instance to set as the last period
        Day lastPeriod = new Day(10, 10, 2023);

        /* write */ periodAxis.setLast(lastPeriod);
        
        /* read */ Day retrievedLastPeriod = (Day) periodAxis.getLast();
        
        // Output the retrieved last period
        System.out.println(retrievedLastPeriod);
    }
}