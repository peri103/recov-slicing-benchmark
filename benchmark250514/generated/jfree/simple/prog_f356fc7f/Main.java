import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis object
        PeriodAxis axis = new PeriodAxis("Sample Axis");

        // Create a Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023);

        /* write */ axis.setFirst(firstDay);

        /* read */ Day retrievedDay = (Day) axis.getFirst();

        // Output the retrieved day
        System.out.println(retrievedDay);
    }
}