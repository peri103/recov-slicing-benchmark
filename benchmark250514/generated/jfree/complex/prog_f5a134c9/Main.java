import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis instance
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");

        // Create a Day instance to set as the last period
        Day lastPeriod = new Day(10, 10, 2023);

        /* write */ periodAxis.setLast(lastPeriod);
        
        // Create additional time periods for complexity
        Month firstMonth = new Month(1, 2023);
        Month secondMonth = new Month(2, 2023);
        Year currentYear = new Year(2023);

        // Perform operations on periods
        System.out.println("First Month: " + firstMonth);
        System.out.println("Second Month: " + secondMonth);
        System.out.println("Current Year: " + currentYear);

        // Initialize another PeriodAxis for additional complexity
        PeriodAxis anotherPeriodAxis = new PeriodAxis("Another Axis");
        anotherPeriodAxis.setFirst(firstMonth);
        anotherPeriodAxis.setLast(secondMonth);

        // Retrieve and print periods from anotherPeriodAxis
        System.out.println("Another Axis First: " + anotherPeriodAxis.getFirst());
        System.out.println("Another Axis Last: " + anotherPeriodAxis.getLast());

        // Perform calculations or operations on periods
        int monthDifference = secondMonth.getMonth() - firstMonth.getMonth();
        System.out.println("Month Difference: " + monthDifference);

        // Retrieve the last period from the original periodAxis
        /* read */ Day retrievedLastPeriod = (Day) periodAxis.getLast();
        
        // Output the retrieved last period
        System.out.println("Retrieved Last Period: " + retrievedLastPeriod);
    }
}