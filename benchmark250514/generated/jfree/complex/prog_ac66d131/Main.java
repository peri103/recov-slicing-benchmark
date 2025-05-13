import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");
        
        // Initialize a RegularTimePeriod object (using Day for demonstration)
        RegularTimePeriod period = new Day(1, 1, 2023);
        
        // Create an ArrayList to store different time periods
        ArrayList<RegularTimePeriod> timePeriods = new ArrayList<>();
        
        // Add different time periods to the list
        timePeriods.add(new Day(15, 5, 2023));
        timePeriods.add(new Month(6, 2023));
        timePeriods.add(new Year(2023));
        
        // Iterate over the list and perform operations
        for (RegularTimePeriod tp : timePeriods) {
            // Set each period as the last period in the axis
            periodAxis.setLast(tp);
            System.out.println("Setting last period: " + tp);
        }
        
        /* write */ periodAxis.setLast(period);
        
        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Unrelated operation: " + i);
        }
        
        /* read */ RegularTimePeriod lastPeriod = periodAxis.getLast();
        
        // Output the result
        System.out.println("Last period: " + lastPeriod);
        
        // Further unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Adding more complexity with nested loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nested loop: i=" + i + ", j=" + j);
            }
        }
    }
}