import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis with a specific name
        PeriodAxis periodAxis = new PeriodAxis("Period Axis");

        // Create a RegularTimePeriod instance for the first day of the current month
        RegularTimePeriod firstDayOfMonth = new Day(1, new Month());

        // Set the first period using the write method
        /* write */ periodAxis.setFirst(firstDayOfMonth);

        // Create another RegularTimePeriod instance for a different day
        RegularTimePeriod anotherDay = new Day(15, new Month());

        // Create a list of periods and add the periods
        ArrayList<RegularTimePeriod> periodList = new ArrayList<>();
        periodList.add(firstDayOfMonth);
        periodList.add(anotherDay);

        // Iterate over the list and print each period
        for (RegularTimePeriod period : periodList) {
            System.out.println("Period: " + period);
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 1 to 10: " + sum);

        // Read the first period using the read method
        /* read */ RegularTimePeriod firstPeriod = periodAxis.getFirst();

        // Print the first period
        System.out.println("First Period from PeriodAxis: " + firstPeriod);

        // Perform additional unrelated operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}