import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");

        // Create a Day object to use with the write method
        Day lastDay = new Day(1, 1, 2023);

        // Use the write method to set the last period
        /* write */ periodAxis.setLast(lastDay);

        // Use the read method to get the last period
        /* read */ Day retrievedLastDay = (Day) periodAxis.getLast();

        // Print the result to verify the read method worked correctly
        System.out.println("Last Day: " + retrievedLastDay);
    }
}