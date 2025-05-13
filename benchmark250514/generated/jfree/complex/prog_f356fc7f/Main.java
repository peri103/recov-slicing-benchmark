import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis object
        PeriodAxis axis = new PeriodAxis("Sample Axis");

        // Create a Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023);

        /* write */ axis.setFirst(firstDay);

        // Create a list to hold multiple periods
        List<Object> periods = new ArrayList<>();
        periods.add(new Month(1, 2023));
        periods.add(new Year(2023));
        
        // Add the first period to the list
        periods.add(firstDay);
        
        // Perform some operations on the list
        for (Object period : periods) {
            System.out.println("Period: " + period);
        }

        // Additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);

        /* read */ Day retrievedDay = (Day) axis.getFirst();

        // Output the retrieved day
        System.out.println("Retrieved Day: " + retrievedDay);

        // More operations with periods list
        for (Object period : periods) {
            if (period instanceof Year) {
                System.out.println("Found a Year: " + period);
            }
        }
    }
}