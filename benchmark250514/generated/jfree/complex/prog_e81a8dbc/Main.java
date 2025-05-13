import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Test Axis");

        // Create a Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023);

        /* write */ periodAxis.setFirst(firstDay);

        // Create additional time periods
        Month firstMonth = new Month(1, 2023);
        Year firstYear = new Year(2023);

        // Set other properties or perform operations
        periodAxis.setLast(firstMonth);
        periodAxis.setAutoRangeTimePeriodClass(Year.class);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Manipulate and print more time periods
        Month lastMonth = new Month(12, 2023);
        Year lastYear = new Year(2024);
        System.out.println("First Month: " + firstMonth);
        System.out.println("Last Month: " + lastMonth);
        System.out.println("First Year: " + firstYear);
        System.out.println("Last Year: " + lastYear);

        // Retrieve the first period set earlier
        /* read */ Day retrievedFirstDay = (Day) periodAxis.getFirst();

        // Print the retrieved first day
        System.out.println("First period: " + retrievedFirstDay);
    }
}