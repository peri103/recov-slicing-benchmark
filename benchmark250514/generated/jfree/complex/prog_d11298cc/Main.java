import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize PeriodAxis
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");

        // Create a RegularTimePeriod instance for testing
        RegularTimePeriod period = new Day();

        // Create a list to hold different time periods
        ArrayList<RegularTimePeriod> periodsList = new ArrayList<>();

        // Add some periods to the list
        periodsList.add(new Day());
        periodsList.add(new Month());
        periodsList.add(new Year());

        // Iterate through the list and perform some operations
        for (RegularTimePeriod p : periodsList) {
            if (p instanceof Day) {
                System.out.println("This is a Day period.");
            } else if (p instanceof Month) {
                System.out.println("This is a Month period.");
            } else if (p instanceof Year) {
                System.out.println("This is a Year period.");
            }
        }

        // Perform some unrelated mathematical operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* write */ periodAxis.setLast(period);

        // More complex operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Access the last period using the read method
        /* read */ RegularTimePeriod lastPeriod = periodAxis.getLast();

        // Print the result to verify the correct period is read
        System.out.println("Last Period: " + lastPeriod);

        // Additional logic to manipulate and display periods
        for (RegularTimePeriod p : periodsList) {
            System.out.println("Period: " + p);
        }
    }
}