import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");
        
        // Create a Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023); // January 1, 2023
        
        /* write */ periodAxis.setFirst(firstDay);
        
        /* read */ Day retrievedFirstDay = (Day) periodAxis.getFirst();
        
        // Print the retrieved first day
        System.out.println("First Day: " + retrievedFirstDay);
    }
}