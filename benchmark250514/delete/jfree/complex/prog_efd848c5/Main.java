import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;

public class Main {
    public static void main(String[] args) {
        // Initialize PeriodAxis
        PeriodAxis axis = new PeriodAxis("Sample Axis");

        // Create various time periods
        Day lastDay = new Day(12, 10, 2023);
        Month currentMonth = new Month(10, 2023);
        Year currentYear = new Year(2023);

        // Set last period
        /* write */ axis.setLast(lastDay);

        // Perform some unrelated operations
        Day firstDay = new Day(1, 1, 2023);
        axis.setFirst(firstDay);

        // Use other methods from PeriodAxis
        axis.setFirstVisible(firstDay);
        axis.setLastVisible(lastDay);

        // More complex operations
        if (currentMonth.getMonth() == 10) {
            System.out.println("It's October!");
        }

        // Calculate days between two periods
        int daysBetween = lastDay.getSerialIndex() - firstDay.getSerialIndex();
        System.out.println("Days between: " + daysBetween);

        // Use the Year class
        if (currentYear.isLeapYear()) {
            System.out.println("This is a leap year!");
        } else {
            System.out.println("This is not a leap year!");
        }

        // Read the last period set
        /* read */ Day readDay = axis.getLast();
        
        // Output the last period
        System.out.println("Last period set: " + readDay);

        // Additional unrelated logic
        for (int i = 0; i < 5; i++) {
            System.out.println("Year: " + (currentYear.getYear() + i));
        }
    }
}