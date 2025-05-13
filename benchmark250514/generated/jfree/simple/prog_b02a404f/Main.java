import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Period Axis");
        
        // Create a Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023); // January 1, 2023
        
        /* write */ periodAxis.setFirst(firstDay);
        
        /* read */ Day firstPeriod = (Day) periodAxis.getFirst();
        
        // Output the first period to verify
        System.out.println("First period: " + firstPeriod);
    }
}