import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");

        // Create a Day object representing the first day of the period
        Day firstDay = new Day(1, 1, 2023);

        /* write */ periodAxis.setFirst(firstDay);

        /* read */ Day retrievedFirstDay = (Day) periodAxis.getFirst();

        // Output the retrieved value to verify correctness
        System.out.println("First Day: " + retrievedFirstDay);
    }
}