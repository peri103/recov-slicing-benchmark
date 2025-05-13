import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");
        
        // Create a Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023); // January 1, 2023
        
        // Write: Set the first period using setFirst method
        /* write */ periodAxis.setFirst(firstDay);
        
        // Read: Retrieve the first period using getFirst method
        /* read */ Day retrievedFirstDay = (Day) periodAxis.getFirst();
        
        // Output the result
        System.out.println("First period: " + retrievedFirstDay);
    }
}