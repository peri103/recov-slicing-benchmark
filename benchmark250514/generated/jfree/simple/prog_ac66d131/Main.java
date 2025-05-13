import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Create a PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");
        
        // Initialize a RegularTimePeriod object (using Day for demonstration)
        RegularTimePeriod period = new Day(1, 1, 2023);
        
        /* write */ periodAxis.setLast(period);
        
        /* read */ RegularTimePeriod lastPeriod = periodAxis.getLast();
        
        // Output the result
        System.out.println("Last period: " + lastPeriod);
    }
}