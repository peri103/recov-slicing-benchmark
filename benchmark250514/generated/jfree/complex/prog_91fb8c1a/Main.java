import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");

        // Create a Day object to use with the write method
        Day lastDay = new Day(1, 1, 2023);

        // Use the write method to set the last period
        /* write */ periodAxis.setLast(lastDay);

        // Create additional time periods
        Month lastMonth = new Month(1, 2023);
        Year lastYear = new Year(2023);

        // Create an ArrayList to store various time periods
        ArrayList<Object> timePeriods = new ArrayList<>();
        timePeriods.add(lastMonth);
        timePeriods.add(lastYear);

        // Iterate through the time periods and print them
        for (Object period : timePeriods) {
            System.out.println("Time Period: " + period);
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Use the read method to get the last period
        /* read */ Day retrievedLastDay = (Day) periodAxis.getLast();

        // Print the result to verify the read method worked correctly
        System.out.println("Last Day: " + retrievedLastDay);

        // Additional operations on the PeriodAxis object
        PeriodAxis anotherAxis = new PeriodAxis("Another Axis");
        anotherAxis.setFirst(new Day(1, 1, 2022));
        Day firstDay = (Day) anotherAxis.getFirst();
        System.out.println("First Day on Another Axis: " + firstDay);
    }
}