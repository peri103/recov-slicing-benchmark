import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");

        // Initialize the Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023);

        // Use the write method to set the first period
        /* write */ periodAxis.setFirst(firstDay);

        // Initialize a Month object
        Month currentMonth = new Month(1, 2023);
        
        // Set the last period using a different method
        periodAxis.setLast(new Day(31, 1, 2023));

        // Add some unrelated complex logic
        Year currentYear = new Year(2023);
        int monthIndex = currentMonth.getMonth();
        int yearValue = currentYear.getYear();
        
        // Perform some calculations
        int daysInMonth = currentMonth.getLastDayOfMonth();
        int daysInYear = currentYear.isLeapYear() ? 366 : 365;
        int remainingDays = daysInYear - daysInMonth;

        // Print the calculated values
        System.out.println("Month: " + monthIndex + ", Year: " + yearValue);
        System.out.println("Days in Month: " + daysInMonth + ", Remaining Days in Year: " + remainingDays);

        // Use the read method to get the first period
        /* read */ Day readFirstDay = (Day) periodAxis.getFirst();

        // Print the result to ensure the read method works correctly
        System.out.println("First period set: " + readFirstDay);

        // Additional logic to manipulate periods
        Day lastDay = new Day(31, 12, 2023);
        periodAxis.setLast(lastDay);
        System.out.println("Last period set: " + periodAxis.getLast());
    }
}