import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;

public class Main {
    public static void main(String[] args) {
        // Initialize classes
        TimePeriodManager manager = new TimePeriodManager();
        CalendarUtils utils = new CalendarUtils();

        // Create various time periods
        Day lastDay = new Day(12, 10, 2023);
        Month currentMonth = new Month(10, 2023);
        Year currentYear = new Year(2023);
        Day firstDay = new Day(1, 1, 2023);

        // Set last period
        manager.setLastPeriod(lastDay);

        // Perform some unrelated operations
        utils.displayMonthInfo(currentMonth);
        int daysBetween = utils.calculateDaysBetween(firstDay, lastDay);
        System.out.println("Days between: " + daysBetween);
        utils.checkLeapYear(currentYear);

        // Read the last period set
        /* read */ Day readDay = manager.getLastPeriod();
        
        // Output the last period
        System.out.println("Last period set: " + readDay);

        // Additional unrelated logic
        for (int i = 0; i < 5; i++) {
            System.out.println("Year: " + (currentYear.getYear() + i));
        }
    }
}