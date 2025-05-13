import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");

        // Create a Day object representing the first day of the period
        Day firstDay = new Day(1, 1, 2023);

        /* write */ periodAxis.setFirst(firstDay);

        // Additional complex logic
        // Create more time periods
        Month firstMonth = new Month(1, 2023);
        Year firstYear = new Year(2023);

        // Initialize another PeriodAxis for comparison
        PeriodAxis periodAxisComparison = new PeriodAxis("Comparison Axis");
        periodAxisComparison.setFirst(firstMonth);

        // Perform some operations with the new axis
        Day comparisonFirstDay = (Day) periodAxisComparison.getFirst();
        System.out.println("Comparison First Day: " + comparisonFirstDay);

        // More complex operations
        // Calculate the difference in days between the two periods
        int dayDifference = firstDay.getDayOfMonth() - comparisonFirstDay.getDayOfMonth();
        System.out.println("Day Difference: " + dayDifference);

        // Use the Year object for additional calculations
        int yearValue = firstYear.getYear();
        System.out.println("Year Value: " + yearValue);

        // Perform a loop to simulate complex operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }

        /* read */ Day retrievedFirstDay = (Day) periodAxis.getFirst();

        // Output the retrieved value to verify correctness
        System.out.println("First Day: " + retrievedFirstDay);
    }
}