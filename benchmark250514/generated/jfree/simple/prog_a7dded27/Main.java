import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");
        
        // Create a Day object to use with setLast method
        Day day = new Day(1, 1, 2023); // January 1, 2023
        
        /* write */ periodAxis.setLast(day);
        
        /* read */ Day lastDay = (Day) periodAxis.getLast();
        
        // Print the result to verify
        System.out.println("Last Day: " + lastDay);
    }
}