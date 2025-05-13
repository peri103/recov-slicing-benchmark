import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;

public class Main {
    public static void main(String[] args) {
        // Initialize PeriodAxis
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");
        
        // Create different time periods
        Day day = new Day(1, 1, 2023);
        Month month = new Month(1, 2023);
        Year year = new Year(2023);

        // Set the first day in the PeriodAxis
        /* write */ periodAxis.setFirst(day);

        // Additional operations with Month and Year
        PeriodAxis monthAxis = new PeriodAxis("Month Axis");
        monthAxis.setFirst(month);

        PeriodAxis yearAxis = new PeriodAxis("Year Axis");
        yearAxis.setFirst(year);

        // Perform some computations
        int totalDaysInMonth = month.getLastDayOfMonth();
        int totalDaysInYear = year.getLastDayOfYear();

        // Print information about Month and Year
        System.out.println("Total days in month: " + totalDaysInMonth);
        System.out.println("Total days in year: " + totalDaysInYear);

        // Retrieve the first day from PeriodAxis
        /* read */ Day firstDay = (Day) periodAxis.getFirst();

        // Print the first day
        System.out.println("First day set in PeriodAxis: " + firstDay);

        // Further computations and logic
        int daysToAdd = 10;
        Day newDay = (Day) firstDay.next(daysToAdd);

        System.out.println("New day after adding " + daysToAdd + " days: " + newDay);
    }
}