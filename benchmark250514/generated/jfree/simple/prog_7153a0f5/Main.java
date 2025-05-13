import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");

        // Initialize the Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023);

        // Use the write method to set the first period
        /* write */ periodAxis.setFirst(firstDay);

        // Use the read method to get the first period
        /* read */ Day readFirstDay = (Day) periodAxis.getFirst();

        // Print the result to ensure the read method works correctly
        System.out.println("First period set: " + readFirstDay);
    }
}