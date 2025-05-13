import org.jfree.chart.axis.RegularTimePeriod;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;
import java.util.ArrayList;

public class TimePeriodDemo {
    public static void main(String[] args) {
        // Initialize the PeriodManager
        PeriodManager manager = new PeriodManager("Demo Axis");

        // Set the last period
        RegularTimePeriod lastPeriod = new Day(1, 1, 2023);
        manager.setLastPeriod(lastPeriod);

        // Create an ArrayList to hold different time periods
        ArrayList<RegularTimePeriod> timePeriods = new ArrayList<>();

        // Add different time periods to the list
        timePeriods.add(new Day(15, 5, 2023));
        timePeriods.add(new Month(6, 2023));
        timePeriods.add(new Year(2023));

        // Iterate over the list and print each time period
        for (RegularTimePeriod period : timePeriods) {
            System.out.println(period);
        }

        // Perform some unrelated complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 2;
        }
        System.out.println("Sum of first 10 even numbers: " + sum);

        // Retrieve the last period set in the PeriodAxis
        /* read */ RegularTimePeriod retrievedPeriod = manager.getLastPeriod();

        // Print the retrieved value to verify
        System.out.println("Last period set in PeriodAxis: " + retrievedPeriod);

        // Additional complex operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}