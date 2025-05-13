import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimePeriod;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");
        
        // Create a Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023); // January 1, 2023
        
        // Create additional TimePeriod objects
        Month firstMonth = new Month(1, 2023); // January 2023
        Month secondMonth = new Month(2, 2023); // February 2023
        
        // Use the setFirst method to set the first period
        /* write */ periodAxis.setFirst(firstDay);

        // Perform some unrelated operations
        TimePeriod[] periods = new TimePeriod[5];
        periods[0] = firstMonth;
        periods[1] = secondMonth;
        periods[2] = new Day(15, 1, 2023); // January 15, 2023
        periods[3] = new Day(28, 2, 2023); // February 28, 2023
        periods[4] = new Day(10, 3, 2023); // March 10, 2023
        
        // Print all periods
        for (TimePeriod period : periods) {
            System.out.println("Period: " + period);
        }
        
        // Perform some calculations
        int totalDays = 0;
        for (TimePeriod period : periods) {
            totalDays += period.getEnd().getDayOfMonth() - period.getStart().getDayOfMonth();
        }
        System.out.println("Total Days: " + totalDays);

        // Retrieve the first period using the getFirst method
        /* read */ Day retrievedFirstDay = (Day) periodAxis.getFirst();
        
        // Print the retrieved first day
        System.out.println("First Day: " + retrievedFirstDay);
        
        // Perform additional operations
        PeriodAxis anotherAxis = new PeriodAxis("Another Axis");
        anotherAxis.setFirst(new Day(5, 5, 2022)); // May 5, 2022
        Day anotherRetrievedDay = (Day) anotherAxis.getFirst();
        System.out.println("Another First Day: " + anotherRetrievedDay);
    }
}